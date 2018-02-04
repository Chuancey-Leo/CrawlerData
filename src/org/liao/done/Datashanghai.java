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
public class Datashanghai {
    public static void fun() throws IOException {
        List<String> list = new ArrayList<>();

        //查看总页数,先爬去取链接
        for (int i = 1; i <= 108; i++) {
            String requestUrl = "http://www.datashanghai.gov.cn/query!queryProduct.action?currentPage="+i+"&dataField=&organId=&envaluationFraction=&dataName=&title=&dataId=&dataArrays=&deptArrays=&envaluationFractionArrays=&searchName=%E8%AF%B7%E8%BE%93%E5%85%A5%E6%95%B0%E6%8D%AE%2F%E5%BA%94%E7%94%A8%2F%E7%A7%BB%E5%8A%A8%E5%BA%94%E7%94%A8%E5%90%8D%E7%A7%B0%E5%85%B3%E9%94%AE%E8%AF%8D...&orderName=updateDate&orders=desc";

            Document doc= Jsoup.connect(requestUrl).get();
            Elements links = doc.select("dl.list > dt > a[href]");

            for (int j = 0; j < links.size(); j++) {
                list.add("http://www.datashanghai.gov.cn/" + links.get(j).attr("href"));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void fun2() throws Exception{
        /* 读入TXT文件 */
        String pathname = "/mnt/work/j2ee/CrawlerData/src/org/liao/done/上海url.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
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

        //设置list大小(链接数目)
        for (int i = 0; i < 1074; i++) {
            l1.add("");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            String requestUrl = list.get(i);

            Document doc= Jsoup.connect(requestUrl).get();

            Elements links = doc.select("table.data > tbody");

            Elements e1 = links.get(0).select("td");

            String temp = e1.get(0).text();
            String[] strings = temp.split("/");
            strings[0] = strings[0].replace(" ", "");
            strings[1] = strings[1].replace(" ", "");


            l1.set(i,strings[0]+","+strings[1]);

            for (int j = 1; j < e1.size()-1; j++) {
                if (!e1.get(j).text().equals("")) {
                    String t = e1.get(j).text();
                    if (t.contains(",")) {
                        t = t.replaceAll(",",".");
                    }
                    l1.set(i, l1.get(i)+","+t);
                } else if (e1.get(j).text().equals("")) {
                    l1.set(i, l1.get(i)+",None");
                }
            }
        }


        FileOutputStream out=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;
        try {
            out = new FileOutputStream(new File("/mnt/work/j2ee/CrawlerData/src/org/liao/done/上海.csv"));
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
    public static void main(String[] args) throws Exception {
        //先运行fun(),再运行fun2()
        //fun();
        fun2();
    }
}
