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

        Document doc= Jsoup.parse("<ul id=\"listul\"><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=66747\">法律援助机构基本信息</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-06-13 14:28:57&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：151</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  15</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:20%\"></span></span> <br><span width=\"500\">所属部门 ：市司法局&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：机构团体</span><br></div><div class=\"cata_content\">资源摘要 ：法律援助机构信息包括机构名称、联系电话、联系地址等内容</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"66747\"><i></i>图谱</span></div><div class=\"cata_format\"><span class=\"cata_xls\"></span><span class=\"cata_xml\"></span><span class=\"cata_json\"></span><span class=\"cata_csv\"></span></div></div></div></div></li><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=54666\">公证处信息</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-06-13 14:00:17&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：90</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  12</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:0%\"></span></span> <br><span width=\"500\">所属部门 ：市司法局&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：机构团体</span><br></div><div class=\"cata_content\">资源摘要 ：广州市公证处信息包括机构名称、地址、电话等内容</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"54666\"><i></i>图谱</span></div><div class=\"cata_format\"><span class=\"cata_xls\"></span><span class=\"cata_xml\"></span><span class=\"cata_json\"></span><span class=\"cata_csv\"></span></div></div></div></div></li><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=54730\">律师信息</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-06-13 15:48:04&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：180</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  8</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:0%\"></span></span> <br><span width=\"500\">所属部门 ：市司法局&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：机构团体</span><br></div><div class=\"cata_content\">资源摘要 ：广州市律师信息包括姓名、执业证号、性别、状态等信息</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"54730\"><i></i>图谱</span></div><div class=\"cata_format\"><span class=\"cata_xls\"></span><span class=\"cata_xml\"></span><span class=\"cata_json\"></span><span class=\"cata_csv\"></span></div></div></div></div></li><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=8521\">工业产品代码表</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2017-06-13 10:24:29&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：1169</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  71</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:45.4167%\"></span></span> <br><span width=\"500\">所属部门 ：市统计局&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：经济发展</span><br></div><div class=\"cata_content\">资源摘要 ：工业产品代码表包括代码、名称、单位、项目等内容</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"8521\"><i></i>图谱</span></div><div class=\"cata_format\"><span class=\"cata_xls\"></span><span class=\"cata_xml\"></span><span class=\"cata_json\"></span><span class=\"cata_csv\"></span></div></div></div></div></li><li><div class=\"catalog_left\"><img src=\"../gz/img/catalog/detail/ico.jpg\" width=\"90\" ,height=\"90\"></div><div class=\"catalog_right\"><div class=\"cata_header\"><span class=\"cata_title\"><a target=\"_blank\" href=\"detail.htm?cata_id=12248\">广州市地理标志产品一览表</a></span></div><div class=\"cata_body\"><div class=\"cata_left\"><div class=\"cata_info\"><span>发布时间 ：2016-08-24 14:08:07&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span>浏览量 ：244</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下载量 ：  5</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评分 ：<span class=\"cata_starcon\"><span class=\"cata_starmon\" style=\"width:0%\"></span></span> <br><span width=\"500\">所属部门 ：市农业局&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <span>所属主题 ：农业农村</span><br></div><div class=\"cata_content\">资源摘要 ：广州市地理标志产品一览</div></div><div class=\"cata_right\"><div class=\"cata_operate\"><span class=\"cata_relnet\" rel=\"12248\"><i></i>图谱</span></div><div class=\"cata_format\"><span class=\"cata_xls\"></span><span class=\"cata_xml\"></span><span class=\"cata_json\"></span><span class=\"cata_csv\"></span></div></div></div></div></li></ul>");
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
        String pathname = "/mnt/work/j2ee/CrawlerData/src/org/liao/zhaoqing.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
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
            out = new FileOutputStream(new File("/mnt/work/j2ee/CrawlerData/src/org/liao/done/zhaoqing.csv"));
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
