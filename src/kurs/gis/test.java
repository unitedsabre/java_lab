package kurs.gis;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

public class test {
    //Получение кода страницы
    private static Document getPage() throws IOException {
        String url = "https://www.gismeteo.ru/weather-reftinsky-12772/weekly/";
        Document page = Jsoup.parse(new URL(url), 30000);
        return page;
  }

    public static void main(String[] args) throws IOException {
        Document page = getPage();
        //Получение необходимых данных
        Element tableWth = page.select("div[class=widget-items]").first();
        Elements table = page.select("div[class=widget-items]");
        //Получение даты
        Elements day = tableWth.select("div[class=widget-row widget-row-days-date]");

        for (Element d : day) {
            String dy = d.select("div[class=day]").text();
            String dt = d.select("div[class=date]").text();
            System.out.println("День недели: " + dy);
            System.out.println("Число: " + dt);
        }

        //Получение значения температуры
        Elements temps = tableWth.select("div[class=values]");
        Elements maxt = temps.select("div[class=maxt]");
        Elements mint = temps.select("div[class=mint]");

        System.out.print("Максимальная температура: " + " ");
        for (Element t : maxt) {
            String tMax = t.select("span[class=unit unit_temperature_c]").text();
            System.out.print(tMax + " ");
        }
        System.out.println();
        System.out.print("Минимальная температура: " + " ");
        for (Element tm : mint) {
            String tMin = tm.select("span[class=unit unit_temperature_c]").text();
            System.out.print(tMin + " ");
        }
        System.out.println();

        Elements wind = table.select("div[data-row=wind-speed]");
        System.out.print("Скорость ветра м,с:" + " ");
        for (Element windT : wind) {
            String winds = windT.select("span[class=wind-unit unit unit_wind_m_s]").text();
            System.out.print(winds + " ");
        }
        System.out.println();

        System.out.print("Максимальное давление: " + " ");
        Elements pressure = table.select("div[class=value style_size_m]");
        Elements davlMax = pressure.select("div[class=maxt]");
        Elements davlMin = pressure.select("div[class=mint]");
        for (Element pressureMax : davlMax) {
            String prMax = pressureMax.select("span[class=unit unit_pressure_mm_hg_atm]").text();
            System.out.print(prMax + " ");
        }
        System.out.println();
        System.out.print("Минимальное давление: " + " ");
        for (Element pressureMin : davlMin) {
            String prMin = pressureMin.select("span[class=unit unit_pressure_mm_hg_atm]").text();
            System.out.print(prMin + " ");
        }
    }
}