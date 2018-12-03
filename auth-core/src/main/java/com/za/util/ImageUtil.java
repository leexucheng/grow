package com.za.util;

import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;


public class ImageUtil {

	/**
	 * @param srcFile
	 * @param descFile
	 * @param ctype 1 倍数比 ，2 质量比
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static  void compressJPG(String srcFile ,String descFile,int ctype) throws FileNotFoundException, IOException {
		
		File src = new File(srcFile);
		
		Long size  = src.length();
		
		Long oneMB = 1024 * 1024 * 1L;
		
		if(size <= oneMB) {
			//文件小于1M不压缩
			System.out.println(" 小于1兆:"+size);
			return;
		}
		
		//压缩方案一：计算缩小倍数（根据实际大小与1M比）
		Float times = size / oneMB.floatValue();
		
		//压缩方案二：质量比计算缩小倍数（根据1M与实际大小比）
		Float quality = oneMB / size.floatValue();
		
		BufferedImage srcBi = ImageIO.read(src);
		
		
		int toWidth = srcBi.getWidth();
		
		int toHeight = srcBi.getHeight();
		
		if(ctype == 1) {
			toWidth = (int)(srcBi.getWidth() / times);
			toHeight = (int)(srcBi.getHeight() / times);
		}
		
		BufferedImage biw = new BufferedImage(toWidth, toHeight, BufferedImage.TYPE_INT_RGB);
		
		System.out.println(toWidth +" * "+toHeight +"------quality:" + quality );
		
		biw.getGraphics().drawImage(srcBi, 0, 0, toWidth, toHeight, null);
		
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(new FileOutputStream(descFile));
		
		JPEGEncodeParam pa = JPEGCodec.getDefaultJPEGEncodeParam(biw);
		pa.setQuality(quality, true);
		
		if(ctype == 1) {
			encoder.encode(biw);
		}else {
			encoder.encode(biw,pa);
		}
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	
	public static void compressPNG(String srcFile ,String descFile) throws FileNotFoundException, IOException{
		
		File src = new File(srcFile);
		
		Long size  = src.length();
		
		Long oneMB = 1024 * 1024 * 1L;
		
		if(size <= oneMB) {
			//文件小于1M不压缩
			System.out.println(" 小于1兆:"+size);
			return;
		}
		
		//压缩方案一：计算缩小倍数（根据实际大小与1M比）
		Float times = size / oneMB.floatValue();
		
		//压缩方案二：质量比计算缩小倍数（根据1M与实际大小比）
		Float quality = oneMB / size.floatValue();
		
		BufferedImage srcBi = ImageIO.read(src);
		
		int toWidth = srcBi.getWidth();
		
		int toHeight = srcBi.getHeight();
		
		toWidth = (int)(srcBi.getWidth() / times);
		toHeight = (int)(srcBi.getHeight() / times);
		
		BufferedImage biw = new BufferedImage(toWidth, toHeight, BufferedImage.TYPE_INT_RGB);
		
		Graphics2D g = biw.createGraphics();
		
		biw = g.getDeviceConfiguration().createCompatibleImage(toWidth, toHeight, Transparency.TRANSLUCENT);
		
		g = biw.createGraphics();
		
		g.drawImage(srcBi, 0, 0, toWidth, toHeight, null);
		
		ImageIO.write(biw, "png", new File(descFile));
	}
	
	public static void main(String[] args) {
		try {
			ImageUtil.compressPNG("d:/0/111.png","d:/0/aaa1.png");
			
			ImageUtil.compressJPG("d:/0/123.jpg","d:/0/abc.jpg",2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
