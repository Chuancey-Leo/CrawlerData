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
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= 3 ; i++) {
            String requestUrl = "http://www.zhaoqing.gov.cn/govsearch/otherProjects/zqgov2015/ysj/index.jsp?ztfl=10&page="+i;
            Document doc = Jsoup.connect(requestUrl).get();

            Elements elements = doc.select("dl.data-list > dd > p > strong > a");
            for (int j = 0; j < elements.size(); j++) {
                list.add(elements.get(j).attr("href"));
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
            out = new FileOutputStream(new File("/mnt/work/j2ee/CrawlerData/src/org/liao/zhaoqing.csv"));
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
}
