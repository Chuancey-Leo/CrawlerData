package org.liao.done;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liao on 17-11-24.
 */
public class Dataguangzhou {
    public static void fun() throws IOException {
        List<String> list = new ArrayList<>();

        Document doc= Jsoup.parse("<ul id=\"listul\"><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=79965\">广州市各区专利申请量_按年统计</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-11-27 16:41:53&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：75</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  4</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:0%\"></span></span> <br><span width=\"500\">所属部门 ：市知识产权局&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：企业服务</span><br></div><div class=\"cata_content\">资源摘要 ：广州市各区专利申请量_按年统计包括年度、区域、发明量、实用新型量、外观设计量、更新时间等内容</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"79965\"><i></i>图谱</span></div><div class=\"cata_format\"><span class=\"cata_xls\"></span><span class=\"cata_xml\"></span><span class=\"cata_json\"></span><span class=\"cata_csv\"></span></div></div></div></div></li><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=79853\">广州市教育基金会捐赠芳名录</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-11-27 17:19:52&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：70</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  9</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:0%\"></span></span> <br><span width=\"500\">所属部门 ：市教育基金会&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：教育科技</span><br></div><div class=\"cata_content\">资源摘要 ：广州市教育基金会捐赠芳名录包括年度、捐款者、捐款数、单位、更新时间等内容</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"79853\"><i></i>图谱</span></div><div class=\"cata_format\"><span class=\"cata_xls\"></span><span class=\"cata_xml\"></span><span class=\"cata_json\"></span><span class=\"cata_csv\"></span></div></div></div></div></li><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=79874\">新型研发机构名单</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-11-27 16:26:25&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：40</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  6</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:0%\"></span></span> <br><span width=\"500\">所属部门 ：市来穗人员服务管理局&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：教育科技</span><br></div><div class=\"cata_content\">资源摘要 ：新型研发机构名单包括年度、机构名称、建设单位、更新时间等内容</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"79874\"><i></i>图谱</span></div><div class=\"cata_format\"><span class=\"cata_xls\"></span><span class=\"cata_xml\"></span><span class=\"cata_json\"></span><span class=\"cata_csv\"></span></div></div></div></div></li><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=79910\">广州市专利代理机构及分支机构名单</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-11-27 16:31:25&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：80</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  7</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:0%\"></span></span> <br><span width=\"500\">所属部门 ：市知识产权局&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：机构团体</span><br></div><div class=\"cata_content\">资源摘要 ：广州市专利代理机构及分支机构名单包括年度、机构名称、地址、网址、更新时间等内容</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"79910\"><i></i>图谱</span></div><div class=\"cata_format\"><span class=\"cata_xls\"></span><span class=\"cata_xml\"></span><span class=\"cata_json\"></span><span class=\"cata_csv\"></span></div></div></div></div></li><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=79947\">广州市专利申请状况_按年统计</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-11-27 16:40:00&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：70</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  9</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:0%\"></span></span> <br><span width=\"500\">所属部门 ：市知识产权局&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：企业服务</span><br></div><div class=\"cata_content\">资源摘要 ：广州市专利申请状况_按年统计包括年度、月份、类型、数量、更新时间等内容</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"79947\"><i></i>图谱</span></div><div class=\"cata_format\"><span class=\"cata_xls\"></span><span class=\"cata_xml\"></span><span class=\"cata_json\"></span><span class=\"cata_csv\"></span></div></div></div></div></li><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=79985\">广州市各区专利授权量_按年统计</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-11-27 16:43:50&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：35</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  6</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:0%\"></span></span> <br><span width=\"500\">所属部门 ：市知识产权局&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：企业服务</span><br></div><div class=\"cata_content\">资源摘要 ：广州市各区专利授权量_按年统计包括年度、区域、发明量、实用新型量、外观设计量、更新时间等内容</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"79985\"><i></i>图谱</span></div><div class=\"cata_format\"><span class=\"cata_xls\"></span><span class=\"cata_xml\"></span><span class=\"cata_json\"></span></div></div></div></div></li><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=80005\">经营未备案国产非特殊用途化妆品企业名单</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-11-27 16:51:33&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：60</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  6</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:0%\"></span></span> <br><span width=\"500\">所属部门 ：市食药监&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：企业服务</span><br></div><div class=\"cata_content\">资源摘要 ：经营未备案国产非特殊用途化妆品企业名单包括年度、期数、被检查单位（人）、被检查单位地址、抽查产品数、未备案产品数、检查单位、检查日期、备注、更新时间等内容</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"80005\"><i></i>图谱</span></div><div class=\"cata_format\"><span class=\"cata_xls\"></span><span class=\"cata_xml\"></span><span class=\"cata_json\"></span><span class=\"cata_csv\"></span></div></div></div></div></li><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=80036\">化妆品生产经营企业监督检查结果</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-11-27 17:10:33&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：50</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  7</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:0%\"></span></span> <br><span width=\"500\">所属部门 ：市食药监&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：经济发展</span><br></div><div class=\"cata_content\">资源摘要 ：化妆品生产经营企业监督检查结果包括年度、期数、被检查企业名称、被检查企业生产许可证号、被检查企业地址、监督检查结果、处理方式、结果处理跟踪落实单位、备注、更新时</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"80036\"><i></i>图谱</span></div><div class=\"cata_format\"><span class=\"cata_xls\"></span><span class=\"cata_xml\"></span><span class=\"cata_json\"></span><span class=\"cata_csv\"></span></div></div></div></div></li><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=79413\">广州市行政事业性收费目录_含涉企收费项目</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-11-23 14:42:20&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：135</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  0</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:0%\"></span></span> <br><span width=\"500\">所属部门 ：市财政局&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：财税金融</span><br></div><div class=\"cata_content\">资源摘要 ：广州市行政事业性收费目录_含涉企收费项目包含年度、收费部门、收费项目、收费依据文号、备注1、备注2、更新日期等内容</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"79413\"><i></i>图谱</span></div><div class=\"cata_format\"></div></div></div></div></li><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=79438\">广州市保障性住房竣工项目</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-11-23 14:30:50&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：195</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  0</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:100%\"></span></span> <br><span width=\"500\">所属部门 ：市住建委&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：城市建设</span><br></div><div class=\"cata_content\">资源摘要 ：广州市保障性住房竣工项目包括年度、月份、建设主体、项目名称、项目地点、套数、公共租赁住房、面积、更新日期等内容</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"79438\"><i></i>图谱</span></div><div class=\"cata_format\"></div></div></div></div></li></ul>");
        Elements right = doc.select("div.catalog_right");

        for (int j = 0; j < right.size(); j++) {
            Elements title = right.get(j).select("span.cata_title > a");
            Elements infors = right.get(j).select("div.cata_info > span");
            String s = title.get(0).text();
            list.add(s);
            String temp = infors.get(0).text().split("：")[1];
            temp += "," +infors.get(1).text().split("：")[1];
            temp += "," +infors.get(2).text().split("：")[1];
            temp += "," +infors.get(4).text().split("：")[1];
            temp += "," +infors.get(5).text().split("：")[1];

            list.set(j, list.get(j) + ","+temp);

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void fun2() throws IOException {
        /* 读入TXT文件 */
        String pathname = "/mnt/work/j2ee/CrawlerData/src/org/liao/zhanjiang.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
        File filename = new File(pathname); // 要读取以上路径的input。txt文件
        InputStreamReader reader = new InputStreamReader(
                new FileInputStream(filename)); // 建立一个输入流对象reader
        BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
        String line = "";

        boolean flag = true;
        List<String> list = new ArrayList<>();
        while (flag) {
            if ((line = br.readLine()) != null) {
                list.add(line);
            } else {
                flag = false;
            }
        }

        List<String> l1 = new ArrayList<>();
        for (int i = 0; i < 122; i++) {
            l1.add("");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            String requestUrl = list.get(i);

            Document doc= Jsoup.connect(requestUrl).get();

            Elements e1 = doc.select(".wftop2lftop1_2").select(".sj18");

            for (int j = 0; j < e1.size(); j++) {
                if (!e1.get(j).text().equals("")) {
                    String t = e1.get(j).text();
                    if (t.contains(",")) {
                        t = t.replaceAll(",",".");
                    }
                    l1.set(i, t);
                } else if (e1.get(j).text().equals("")) {
                    l1.set(i, "None");
                }
            }


        }


        FileOutputStream out=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;
        try {
            out = new FileOutputStream(new File("/mnt/work/j2ee/CrawlerData/src/org/liao/done/zhanjiang.csv"));
            osw = new OutputStreamWriter(out);
            bw =new BufferedWriter(osw);
            if(l1!=null && !l1.isEmpty()){
                for(String data : l1){
                    bw.append(data).append("\r");
                }
            }

        } catch (Exception e) {

        }finally{
            if(bw!=null){
                try {
                    bw.close();
                    bw=null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(osw!=null){
                try {
                    osw.close();
                    osw=null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out!=null){
                try {
                    out.close();
                    out=null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        fun();
    }


}
