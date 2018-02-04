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
public class nanhai {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        //页数设置
        for (int i = 1; i <= 18 ; i++) {
            String requestUrl = "http://data.nanhai.gov.cn/cms/sites/sjzy/load_sj_theme.jsp?tid=all&page="+i;
            Document doc = Jsoup.connect(requestUrl).get();

            Elements elements = doc.select("table");

            Elements elements1 = elements.select("tr");

            for (int j = 1; j < elements1.size(); j++) {
                Elements elements2 = elements1.get(j).select("td");

                list.add("http://data.nanhai.gov.cn"+elements2.get(0).select("a").attr("href"));
            }

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Document document = Jsoup.connect(list.get(i)).get();

            result.add(document.select("div.sjml_title > span").text());

            Elements e = document.select("table");
            Elements test = e.select("tr");

            for (int j = 0; j < test.size(); j++) {
                Elements e1 = test.get(j).select("td");
                String t = e1.get(1).text();
                if (t.equals("")) {
                    t = "None";
                } else if (t.contains(",")) {
                    t = t.replaceAll(",", ".");
                }
                result.set(i, result.get(i) + "," + t);
            }
        }

/*        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }*/

        FileOutputStream out=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;
        try {
            out = new FileOutputStream(new File("/mnt/work/j2ee/CrawlerData/src/org/liao/done/nanhai.csv"));
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
