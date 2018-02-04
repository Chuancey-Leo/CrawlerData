package org.liao.done;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liao on 17-11-27.
 */
public class zhaoqing {

    public static void fun() throws Exception {
        List<String> list = new ArrayList<>();

        //经济建设
        //修改页数
        for (int i = 1; i <= 6 ; i++) {
            String requestUrl = "http://www.zhaoqing.gov.cn/govsearch/otherProjects/zqgov2015/ysj/index.jsp?ztfl=1&page="+i;
            Document doc = Jsoup.connect(requestUrl).get();

            Elements elements = doc.select("p.title > strong > a");
            for (int j = 0; j < elements.size(); j++) {
                list.add(elements.get(j).attr("href"));
            }
        }

        //环境资源
        //修改页数
        for (int i = 1; i <= 7 ; i++) {
            String requestUrl = "http://www.zhaoqing.gov.cn/govsearch/otherProjects/zqgov2015/ysj/index.jsp?ztfl=2&page="+i;
            Document doc = Jsoup.connect(requestUrl).get();

            Elements elements = doc.select("p.title > strong > a");
            for (int j = 0; j < elements.size(); j++) {
                list.add(elements.get(j).attr("href"));
            }
        }


        //教育科技
        //修改页数
        for (int i = 1; i <= 6 ; i++) {
            String requestUrl = "http://www.zhaoqing.gov.cn/govsearch/otherProjects/zqgov2015/ysj/index.jsp?ztfl=3&page="+i;
            Document doc = Jsoup.connect(requestUrl).get();

            Elements elements = doc.select("p.title > strong > a");
            for (int j = 0; j < elements.size(); j++) {
                list.add(elements.get(j).attr("href"));
            }
        }


        //道路交通
        //修改页数
        for (int i = 1; i <= 5 ; i++) {
            String requestUrl = "http://www.zhaoqing.gov.cn/govsearch/otherProjects/zqgov2015/ysj/index.jsp?ztfl=4&page="+i;
            Document doc = Jsoup.connect(requestUrl).get();

            Elements elements = doc.select("p.title > strong > a");
            for (int j = 0; j < elements.size(); j++) {
                list.add(elements.get(j).attr("href"));
            }
        }


        //社会发展
        //修改页数
        for (int i = 1; i <= 5 ; i++) {
            String requestUrl = "http://www.zhaoqing.gov.cn/govsearch/otherProjects/zqgov2015/ysj/index.jsp?ztfl=5&page="+i;
            Document doc = Jsoup.connect(requestUrl).get();

            Elements elements = doc.select("p.title > strong > a");
            for (int j = 0; j < elements.size(); j++) {
                list.add(elements.get(j).attr("href"));
            }
        }


        //公共安全
        //修改页数
        for (int i = 1; i <= 5 ; i++) {
            String requestUrl = "http://www.zhaoqing.gov.cn/govsearch/otherProjects/zqgov2015/ysj/index.jsp?ztfl=6&page="+i;
            Document doc = Jsoup.connect(requestUrl).get();

            Elements elements = doc.select("p.title > strong > a");
            for (int j = 0; j < elements.size(); j++) {
                list.add(elements.get(j).attr("href"));
            }
        }

        //文化休闲
        //修改页数
        for (int i = 1; i <= 5 ; i++) {
            String requestUrl = "http://www.zhaoqing.gov.cn/govsearch/otherProjects/zqgov2015/ysj/index.jsp?ztfl=7&page="+i;
            Document doc = Jsoup.connect(requestUrl).get();

            Elements elements = doc.select("p.title > strong > a");
            for (int j = 0; j < elements.size(); j++) {
                list.add(elements.get(j).attr("href"));
            }
        }

        //卫生健康
        //修改页数
        for (int i = 1; i <= 4 ; i++) {
            String requestUrl = "http://www.zhaoqing.gov.cn/govsearch/otherProjects/zqgov2015/ysj/index.jsp?ztfl=8&page="+i;
            Document doc = Jsoup.connect(requestUrl).get();

            Elements elements = doc.select("p.title > strong > a");
            for (int j = 0; j < elements.size(); j++) {
                list.add(elements.get(j).attr("href"));
            }
        }


        //民生健康
        //修改页数
        for (int i = 1; i <= 6 ; i++) {
            String requestUrl = "http://www.zhaoqing.gov.cn/govsearch/otherProjects/zqgov2015/ysj/index.jsp?ztfl=9&page="+i;
            Document doc = Jsoup.connect(requestUrl).get();

            Elements elements = doc.select("p.title > strong > a");
            for (int j = 0; j < elements.size(); j++) {
                list.add(elements.get(j).attr("href"));
            }
        }

        //城市健康
        //修改页数
        for (int i = 1; i <= 6 ; i++) {
            String requestUrl = "http://www.zhaoqing.gov.cn/govsearch/otherProjects/zqgov2015/ysj/index.jsp?ztfl=10&page="+i;
            Document doc = Jsoup.connect(requestUrl).get();

            Elements elements = doc.select("p.title > strong > a");
            for (int j = 0; j < elements.size(); j++) {
                list.add(elements.get(j).attr("href"));
            }
        }

        //写入txt
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void fun2() throws Exception {

        /* 读入TXT文件 */
        String pathname = "/mnt/work/j2ee/CrawlerData/src/org/liao/done/肇庆url.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
        File filename = new File(pathname); // 要读取以上路径的input。txt文件
        InputStreamReader reader = new InputStreamReader(
                new FileInputStream(filename)); // 建立一个输入流对象reader
        BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
        String line = "";

        boolean flag = true;

        //超链接list
        List<String> list = new ArrayList<>();
        while (flag) {
            if ((line = br.readLine()) != null) {
                list.add(line);
            } else {
                flag = false;
            }
        }

        List<String> result = new ArrayList<>();



        for (int i = 0; i < list.size(); i++) {
            Document document = Jsoup.connect(list.get(i)).get();

            result.add(document.select("div.data-tab > p").text());

            Elements e = document.select("div.data-tab > table");
            Elements test = e.select("tr");
            System.out.println(test.size());
            for (int j = 0; j < test.size(); j++) {
                Elements e1 = test.get(j).select("td");
                String t = e1.get(1).text();
                if (t.equals("")) {
                    t = "None";
                }
                result.set(i, result.get(i) + "," + t);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        FileOutputStream out=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;
        try {
            out = new FileOutputStream(new File("/mnt/work/j2ee/CrawlerData/src/org/liao/done/肇庆.csv"));
            osw = new OutputStreamWriter(out);
            bw =new BufferedWriter(osw);
            if(result!=null && !result.isEmpty()){
                for(String data : result){
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

    public static void main(String[] args) throws Exception {
        fun2();
    }


}
