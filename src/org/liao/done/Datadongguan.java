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
public class Datadongguan {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 768; i++) {
            list.add("");
        }
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(new File("/mnt/work/j2ee/CrawlerData/src/org/liao/test.txt")));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        Document doc = Jsoup.parse(result.toString());

        Elements elements = doc.select("div.right_list > table");
        for (int i = 0; i < elements.size(); i++) {
            Elements temp = elements.get(i).select("span");

            for (int j = 0; j < temp.size(); j++) {
                String t = temp.get(j).text();
                if (t.contains("：")) {
                    list.set(i, list.get(i) + "," + t.split("：")[1]);
                } else {
                    list.set(i, list.get(i) + "," + t);
                }
            }

            Elements temp2 = elements.get(i).select("td");
            System.out.println(temp2.get(2).text());
            String t2 = temp2.get(2).text();

            System.out.println(t2.length());
            if (t2.length() == 5) {
                System.out.println(t2);
                t2 = "None";
            } else {
                t2 = t2.split("：")[1];
                System.out.println(t2);
            }

            if (t2.contains(",")) {
                t2 = t2.replaceAll(",", ".");
            }
            list.set(i, list.get(i) + "," + t2);
        }

        FileOutputStream out=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;
        try {
            out = new FileOutputStream(new File("/mnt/work/j2ee/CrawlerData/src/org/liao/湛江.csv"));
            osw = new OutputStreamWriter(out);
            bw =new BufferedWriter(osw);
            if(list!=null && !list.isEmpty()){
                for(String data : list){
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
}
