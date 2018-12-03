package com.za.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	
	private final static String XLS = "xls";
	private final static String XLSX = "xlsx";
	private final static int BATCH_SIZE = 500;
	private final static Logger LOGGER = LoggerFactory.getLogger(FileController.class);

	@RequestMapping("/file/ele/import")
	public @ResponseBody String importElv(MultipartFile file) {
		
		Sheet sheet = this.readExcel(file);
		
		if (sheet == null || sheet.getLastRowNum() == 0){
			LOGGER.info("importExcel 空");
			return "importExcel 空";
		}
		int rows = sheet.getLastRowNum();
		LOGGER.info("row number : {}",rows);
		
		LOGGER.info("cell number : {}",sheet.getRow(rows).getLastCellNum());
		
		for (int i = 0; i <= rows; i ++){
			if(i < 3)continue;
			Row row = sheet.getRow(i);
			if (row != null){
				System.out.println("row number :"+i);
				int cells = row.getLastCellNum();
				for(int j=0;j<cells;j++) {
					System.out.print(j + "\t");
					System.out.print(readCellValue(row.getCell(j)) + "\t");
				}
				System.out.println();
			}
			int num = i % BATCH_SIZE;
			if (num == 0){
				
			}
			if (i == (rows-1)){
				
			}
		}
		
		return "ok";
	}
	
	private String readCellValue(Cell cell) {
		if(cell == null)return "";
		if(cell.getCellTypeEnum().equals(CellType.NUMERIC)) {
			return "" + cell.getNumericCellValue();
		}
		if(cell.getCellTypeEnum().equals(CellType.STRING)) {
			return cell.getStringCellValue();
		}
		
		return cell.getStringCellValue();
	}
	
	private Sheet readExcel(MultipartFile uploadFile){
		Workbook workbook = null;
		Sheet sheet = null;
		try {
			String fileName = uploadFile.getOriginalFilename();
			LOGGER.info("fileName:{}",fileName);
			
			String suffix = fileName.split("\\.")[1];
			if (XLS.endsWith(suffix)){
				workbook = new HSSFWorkbook(uploadFile.getInputStream());
			} else if (XLSX.endsWith(suffix)){
				workbook = new XSSFWorkbook(uploadFile.getInputStream());
			} else {
				LOGGER.info("it is not Excel");
				return null;
			}
			
			sheet = workbook.getSheetAt(0);
		} catch (Exception e) {
			LOGGER.error("error", e);
			return null;
		}finally {
			if (workbook != null){
				try {
					workbook.close();
				} catch (IOException e) {
					LOGGER.error("error:{}", e);
					return null;
				}
			}
		}
		return sheet;
	}
	
	private void generateModel(List<Map<String,String>> list) {
		
	}
}
