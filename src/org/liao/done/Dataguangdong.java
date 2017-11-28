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
public class Dataguangdong {
    public static void fun() throws IOException {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= 21; i++) {
            String requestUrl = "http://www.gddata.gov.cn/index.php/data/ls/type/0/p/"+i+".html";

            Document doc= Jsoup.connect(requestUrl).get();
            Elements links = doc.select("p.data-title > a[href]");

            for (int j = 0; j < links.size(); j++) {
                list.add("http://www.gddata.gov.cn/" + links.get(j).attr("href"));
            }
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
        for (int i = 0; i < 209; i++) {
            l1.add("");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            String requestUrl = list.get(i);

            Document doc= Jsoup.connect(requestUrl).get();

            Elements e1 = doc.select("p.data-title");

            System.out.println(e1.get(0));
            l1.set(i,e1.get(0).text());
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
        fun2();
    }


}
