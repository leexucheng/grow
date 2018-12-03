<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"></meta>
    <title>个人征信报告</title>
    <style mce_bogus="1" type="text/css">                                                  
    body {
        font-family: SimSun;
        background:none;
        margin: 0;
    }
    .page-title {
        width: 18cm;
        background: white;
        padding-top: 4cm;
    }

    .page {
        width: 16cm;
        min-height: 29.7cm;

        margin: 0 auto;
        background: white;
    }

    .report-info {
        display: -webkit-flex;
        display: flex;
        flex-wrap: wrap;
        text-align: left;
    }

    .report-info > div {
        width: 100%;
        font-size: 16px;
        line-height: 1cm;
        border : aqua 1px solid;
    }

    .report-info > div > label {
        display: inline-block;
        width: 2.5cm;
    }

    .item-title {
        position: relative;
        line-height: 40px;
        padding-left: 20px;
        font-size: 16px;
        margin: 35px 0 0;
    }

    .item-title:before {
        content: '';
        position: absolute;
        left: 0;
        top: 0;
        height: 40px;
        width: 3px;
        background-color: #2d8cf0;

    }

    .item-table {
        width: 100%;
        border: 1px solid #cccccc;
        border-collapse:collapse;
        font-size: 12px;
        margin-top: 30px;
    }
    .item-table > tr,td{
        border: 1px solid #cccccc;
        border-collapse:collapse;
    }
    th{
        background-color: rgb(242, 242, 242);
        border: 1px solid #cccccc;
        border-collapse:collapse;
    }
    th,td{
        padding: unset;
        height: 35px;
        text-align: center;
    }
    tr>th:first-child{
        width: 100px;
    }
    caption{
        height: 35px;
        text-align: center;
        border: 1px solid #cccccc;
        border-bottom: none;
        font-size: 12px;
        font-weight: bold;
        line-height: 35px;
    }
    .item-info{
        display: -webkit-flex;
        display: flex;
        flex-wrap: wrap;
        padding: 0 10px;
    }
    .item-info>div{
        width: 50%;
        font-size: 12px;
        line-height: 1.5;
        margin: 8px 0;
        text-align: left;
        overflow: hidden;
    }
    .item-info>div>label, .item-info-one>label{
        margin-right: 15px;
        float: left;
        color: #666666;
    }

    .item-info>table>tr>td>label{
        margin-right: 15px;
        float: left;
        color: #666666;
    }
    .item-info>div>span{
        float: left;
        max-width: 6cm;
        margin-right: 15px;

    }

    .item-info-one{
        text-align: left;
        margin:16px 10px;
        line-height: 1.5;
        overflow: hidden;

    }
    .item-info-one>span{
        float: left;
        max-width: 10cm;
        margin-right: 15px;
    }
    tfoot>tr>td:first-child{
        background-color: rgb(242, 242, 242);
    }
    </style>
</head>
<body style = "font-family: SimSun;">
<div>
   
    <div class="page">
        <div style="border-bottom: 0px solid #cccccc;padding-bottom: 20px">
            <#list data as item>
            <table class="item-table" rules="all" align="center" border="1">
                <tr>
                    <td>短代码</td>
                    <td>${item.shortCode}</td>
                    
                </tr>
                <tr>
                    <td>内部编号 </td>
                    <td>${item.innerCode}</td>
                    
                </tr>
				<tr>
                    <td>二维码</td>
                    <td>${item.img}</td>
                    
                </tr>

            </table><br/>
			</#list>
        </div>
    </div>

</div>
</body>
</html>