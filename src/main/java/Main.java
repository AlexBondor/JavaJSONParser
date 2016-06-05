/**
 * @author Alex, 6/5/2016.
 */

import Objects.Wunderground.Date;
import Objects.Wunderground.History;
import Objects.Wunderground.Observation;
import com.alibaba.fastjson.JSON;

public class Main {
    public static void main(String args[]) {

        String dateString = "{\n" +
                "\t\t\"pretty\": \"June 1, 2016\",\n" +
                "\t\t\"year\": \"2016\",\n" +
                "\t\t\"mon\": \"06\",\n" +
                "\t\t\"mday\": \"01\",\n" +
                "\t\t\"hour\": \"00\",\n" +
                "\t\t\"min\": \"00\",\n" +
                "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
                "\t\t}";

        Date date = new Date();

        date = JSON.parseObject(dateString, Date.class);

        String observationString = "{\n" +
                "\t\t\"date\": {\n" +
                "\t\t\"pretty\": \"12:00 AM EEST on June 01, 2016\",\n" +
                "\t\t\"year\": \"2016\",\n" +
                "\t\t\"mon\": \"06\",\n" +
                "\t\t\"mday\": \"01\",\n" +
                "\t\t\"hour\": \"00\",\n" +
                "\t\t\"min\": \"00\",\n" +
                "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
                "\t\t},\n" +
                "\t\t\"utcdate\": {\n" +
                "\t\t\"pretty\": \"9:00 PM GMT on May 31, 2016\",\n" +
                "\t\t\"year\": \"2016\",\n" +
                "\t\t\"mon\": \"05\",\n" +
                "\t\t\"mday\": \"31\",\n" +
                "\t\t\"hour\": \"21\",\n" +
                "\t\t\"min\": \"00\",\n" +
                "\t\t\"tzname\": \"UTC\"\n" +
                "\t\t},\n" +
                "\t\t\"tempm\":\"15\", \"tempi\":\"59\",\"dewptm\":\"14\", \"dewpti\":\"56\",\"hum\":\"88\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"260\",\"wdire\":\"West\",\"vism\":\"10\", \"visi\":\"6\",\"pressurem\":\"1015\", \"pressurei\":\"29.97\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"\",\"icon\":\"\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 31211 15120 22997 02602 10149 20136 39666 40149 53010 333 55300 10204 20000\" }";

        Observation observation = new Observation();

        observation = JSON.parseObject(observationString, Observation.class);

        History history = new History();

        history = JSON.parseObject(json, History.class);

        System.out.println(history.getDate().getPretty());
    }

    public static String json = "\n" +
            "{\n" +
            "  \"response\": {\n" +
            "  \"version\":\"0.1\",\n" +
            "  \"termsofService\":\"http://www.wunderground.com/weather/api/d/terms.html\",\n" +
            "  \"features\": {\n" +
            "  \"history\": 1\n" +
            "  }\n" +
            "\t}\n" +
            "\t\t,\n" +
            "\t\"history\": {\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"June 1, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"00\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"May 31, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"05\",\n" +
            "\t\t\"mday\": \"31\",\n" +
            "\t\t\"hour\": \"21\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"observations\": [\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"12:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"00\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"9:00 PM GMT on May 31, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"05\",\n" +
            "\t\t\"mday\": \"31\",\n" +
            "\t\t\"hour\": \"21\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"15\", \"tempi\":\"59\",\"dewptm\":\"14\", \"dewpti\":\"56\",\"hum\":\"88\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"260\",\"wdire\":\"West\",\"vism\":\"10\", \"visi\":\"6\",\"pressurem\":\"1015\", \"pressurei\":\"29.97\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"\",\"icon\":\"\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 31211 15120 22997 02602 10149 20136 39666 40149 53010 333 55300 10204 20000\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"12:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"00\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"9:00 PM GMT on May 31, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"05\",\n" +
            "\t\t\"mday\": \"31\",\n" +
            "\t\t\"hour\": \"21\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"14.0\", \"tempi\":\"57.2\",\"dewptm\":\"13.0\", \"dewpti\":\"55.4\",\"hum\":\"94\",\"wspdm\":\"3.7\", \"wspdi\":\"2.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"280\",\"wdire\":\"West\",\"vism\":\"-9999.0\", \"visi\":\"-9999.0\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Clear\",\"icon\":\"clear\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 312100Z 28002KT CAVOK 14/13 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"1:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"01\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"10:00 PM GMT on May 31, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"05\",\n" +
            "\t\t\"mday\": \"31\",\n" +
            "\t\t\"hour\": \"22\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"14\", \"tempi\":\"57\",\"dewptm\":\"13\", \"dewpti\":\"56\",\"hum\":\"96\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"230\",\"wdire\":\"SW\",\"vism\":\"10\", \"visi\":\"6\",\"pressurem\":\"1016\", \"pressurei\":\"29.99\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"\",\"icon\":\"\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 31221 15120 22997 02302 10138 20134 39670 40155 52014 333 55300 10206 20000\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"1:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"01\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"10:00 PM GMT on May 31, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"05\",\n" +
            "\t\t\"mday\": \"31\",\n" +
            "\t\t\"hour\": \"22\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"13.0\", \"tempi\":\"55.4\",\"dewptm\":\"13.0\", \"dewpti\":\"55.4\",\"hum\":\"100\",\"wspdm\":\"1.9\", \"wspdi\":\"1.2\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"310\",\"wdire\":\"NW\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Shallow Fog\",\"icon\":\"fog\",\"fog\":\"1\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 312200Z 31001KT 9999 MIFG NSC 13/13 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"2:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"02\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"11:00 PM GMT on May 31, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"05\",\n" +
            "\t\t\"mday\": \"31\",\n" +
            "\t\t\"hour\": \"23\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"13\", \"tempi\":\"56\",\"dewptm\":\"13\", \"dewpti\":\"55\",\"hum\":\"96\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"240\",\"wdire\":\"WSW\",\"vism\":\"10\", \"visi\":\"6\",\"pressurem\":\"1016\", \"pressurei\":\"30.00\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"\",\"icon\":\"\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 31231 15120 22997 02402 10132 20129 39671 40157 52009 333 55300 10211 20000\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"2:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"02\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"11:00 PM GMT on May 31, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"05\",\n" +
            "\t\t\"mday\": \"31\",\n" +
            "\t\t\"hour\": \"23\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"13.0\", \"tempi\":\"55.4\",\"dewptm\":\"12.0\", \"dewpti\":\"53.6\",\"hum\":\"94\",\"wspdm\":\"1.9\", \"wspdi\":\"1.2\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Shallow Fog\",\"icon\":\"fog\",\"fog\":\"1\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 312300Z VRB01KT 9999 MIFG NSC 13/12 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"3:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"03\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"12:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"00\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"12\", \"tempi\":\"54\",\"dewptm\":\"12\", \"dewpti\":\"53\",\"hum\":\"95\",\"wspdm\":\"10.8\", \"wspdi\":\"6.7\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"230\",\"wdire\":\"SW\",\"vism\":\"10\", \"visi\":\"6\",\"pressurem\":\"1016\", \"pressurei\":\"30.00\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"\",\"icon\":\"\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01001 15120 02997 02303 10125 20116 39672 40159 52005 60001 333 55300 10222 20000\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"3:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"03\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"12:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"00\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"12.0\", \"tempi\":\"53.6\",\"dewptm\":\"12.0\", \"dewpti\":\"53.6\",\"hum\":\"100\",\"wspdm\":\"0.0\", \"wspdi\":\"0.0\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"North\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Shallow Fog\",\"icon\":\"fog\",\"fog\":\"1\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010000Z 00000KT 9999 MIFG NSC 12/12 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"4:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"04\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"1:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"01\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"12\", \"tempi\":\"53\",\"dewptm\":\"11\", \"dewpti\":\"52\",\"hum\":\"95\",\"wspdm\":\"10.8\", \"wspdi\":\"6.7\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"230\",\"wdire\":\"SW\",\"vism\":\"10\", \"visi\":\"6\",\"pressurem\":\"1016\", \"pressurei\":\"30.00\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"\",\"icon\":\"\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01011 15120 22997 02303 10118 20111 39670 40158 54000 333 55300 10214 20000\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"4:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"04\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"1:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"01\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"11.0\", \"tempi\":\"51.8\",\"dewptm\":\"11.0\", \"dewpti\":\"51.8\",\"hum\":\"100\",\"wspdm\":\"0.0\", \"wspdi\":\"0.0\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"North\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Shallow Fog\",\"icon\":\"fog\",\"fog\":\"1\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010100Z 00000KT 9999 MIFG NSC 11/11 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"5:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"05\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"2:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"02\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"11\", \"tempi\":\"52\",\"dewptm\":\"11\", \"dewpti\":\"51\",\"hum\":\"97\",\"wspdm\":\"10.8\", \"wspdi\":\"6.7\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"220\",\"wdire\":\"SW\",\"vism\":\"10\", \"visi\":\"6\",\"pressurem\":\"1016\", \"pressurei\":\"30.00\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"\",\"icon\":\"\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01021 15120 22997 02203 10113 20108 39670 40159 54001 333 55300 10218 20000\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"5:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"05\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"2:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"02\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"11.0\", \"tempi\":\"51.8\",\"dewptm\":\"10.0\", \"dewpti\":\"50.0\",\"hum\":\"94\",\"wspdm\":\"3.7\", \"wspdi\":\"2.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"80\",\"wdire\":\"East\",\"vism\":\"0.8\", \"visi\":\"0.5\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Fog\",\"icon\":\"fog\",\"fog\":\"1\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010200Z 08002KT 0800 R25/0600N FG NSC 11/10 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"5:30 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"05\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"2:30 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"02\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"11.0\", \"tempi\":\"51.8\",\"dewptm\":\"10.0\", \"dewpti\":\"50.0\",\"hum\":\"94\",\"wspdm\":\"0.0\", \"wspdi\":\"0.0\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"North\",\"vism\":\"0.6\", \"visi\":\"0.4\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Fog\",\"icon\":\"fog\",\"fog\":\"1\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010230Z 00000KT 0600 R25/0225N FG NSC 11/10 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"6:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"06\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"3:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"03\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"11\", \"tempi\":\"51\",\"dewptm\":\"10\", \"dewpti\":\"51\",\"hum\":\"99\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"230\",\"wdire\":\"SW\",\"vism\":\"10\", \"visi\":\"6\",\"pressurem\":\"1016\", \"pressurei\":\"30.01\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"\",\"icon\":\"\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01031 15120 22997 02302 10108 20104 39671 40162 54000 333 55300 10209 20000\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"6:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"06\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"3:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"03\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"10.0\", \"tempi\":\"50.0\",\"dewptm\":\"10.0\", \"dewpti\":\"50.0\",\"hum\":\"100\",\"wspdm\":\"3.7\", \"wspdi\":\"2.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"110\",\"wdire\":\"ESE\",\"vism\":\"-9999.0\", \"visi\":\"-9999.0\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Fog\",\"icon\":\"fog\",\"fog\":\"1\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010300Z 11002KT 0550 R25/0100V0275N FG NSC 10/10 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"6:30 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"06\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"3:30 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"03\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"10.0\", \"tempi\":\"50.0\",\"dewptm\":\"10.0\", \"dewpti\":\"50.0\",\"hum\":\"100\",\"wspdm\":\"3.7\", \"wspdi\":\"2.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"0.6\", \"visi\":\"0.4\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Fog\",\"icon\":\"fog\",\"fog\":\"1\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010330Z VRB02KT 0600 R25/0275V0500D FG NSC 10/10 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"7:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"07\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"4:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"04\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"11\", \"tempi\":\"52\",\"dewptm\":\"10\", \"dewpti\":\"51\",\"hum\":\"95\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"210\",\"wdire\":\"SSW\",\"vism\":\"20\", \"visi\":\"12\",\"pressurem\":\"1016\", \"pressurei\":\"30.01\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Scattered Clouds\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01041 15120 22998 22102 10112 20105 39671 40161 54001 81031 333 55300 10158 20104\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"7:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"07\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"4:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"04\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"11.0\", \"tempi\":\"51.8\",\"dewptm\":\"11.0\", \"dewpti\":\"51.8\",\"hum\":\"100\",\"wspdm\":\"3.7\", \"wspdi\":\"2.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"-9999.0\", \"visi\":\"-9999.0\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Fog\",\"icon\":\"fog\",\"fog\":\"1\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010400Z VRB02KT 0550 R25/0325N FG NSC 11/11 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"7:30 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"07\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"4:30 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"04\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"11.0\", \"tempi\":\"51.8\",\"dewptm\":\"11.0\", \"dewpti\":\"51.8\",\"hum\":\"100\",\"wspdm\":\"3.7\", \"wspdi\":\"2.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"-9999.0\", \"visi\":\"-9999.0\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Fog\",\"icon\":\"fog\",\"fog\":\"1\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010430Z VRB02KT 0550 R25/0300V0500N FG NSC 11/11 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"8:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"08\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"5:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"05\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"13\", \"tempi\":\"56\",\"dewptm\":\"11\", \"dewpti\":\"52\",\"hum\":\"83\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"200\",\"wdire\":\"SSW\",\"vism\":\"20\", \"visi\":\"12\",\"pressurem\":\"1016\", \"pressurei\":\"29.99\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Clear\",\"icon\":\"clear\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01051 15120 22998 12002 10133 20112 39670 40156 54000 80001 333 55307 00063 20561\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"8:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"08\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"5:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"05\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"12.0\", \"tempi\":\"53.6\",\"dewptm\":\"12.0\", \"dewpti\":\"53.6\",\"hum\":\"100\",\"wspdm\":\"3.7\", \"wspdi\":\"2.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"-9999.0\", \"visi\":\"-9999.0\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Fog\",\"icon\":\"fog\",\"fog\":\"1\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010500Z VRB02KT 0550 R25/0375N FG NSC 12/12 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"8:30 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"08\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"5:30 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"05\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"14.0\", \"tempi\":\"57.2\",\"dewptm\":\"13.0\", \"dewpti\":\"55.4\",\"hum\":\"94\",\"wspdm\":\"1.9\", \"wspdi\":\"1.2\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010530Z VRB01KT 9999 FEW002 14/13 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"9:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"09\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"6:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"06\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"17\", \"tempi\":\"62\",\"dewptm\":\"12\", \"dewpti\":\"54\",\"hum\":\"66\",\"wspdm\":\"3.6\", \"wspdi\":\"2.2\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"180\",\"wdire\":\"South\",\"vism\":\"20\", \"visi\":\"12\",\"pressurem\":\"1015\", \"pressurei\":\"29.99\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Clear\",\"icon\":\"clear\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01061 15120 02998 31801 10166 20120 39673 40153 52002 60002 80005 333 10178 20108 30012 55310 00338 21197\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"9:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"09\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"6:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"06\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"16.0\", \"tempi\":\"60.8\",\"dewptm\":\"13.0\", \"dewpti\":\"55.4\",\"hum\":\"82\",\"wspdm\":\"5.6\", \"wspdi\":\"3.5\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"70\",\"wdire\":\"ENE\",\"vism\":\"-9999.0\", \"visi\":\"-9999.0\",\"pressurem\":\"1016\", \"pressurei\":\"30.01\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Clear\",\"icon\":\"clear\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010600Z 07003KT 020V120 CAVOK 16/13 Q1016\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"9:30 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"09\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"6:30 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"06\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"16.0\", \"tempi\":\"60.8\",\"dewptm\":\"14.0\", \"dewpti\":\"57.2\",\"hum\":\"88\",\"wspdm\":\"9.3\", \"wspdi\":\"5.8\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"70\",\"wdire\":\"ENE\",\"vism\":\"-9999.0\", \"visi\":\"-9999.0\",\"pressurem\":\"1016\", \"pressurei\":\"30.01\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Clear\",\"icon\":\"clear\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010630Z 07005KT 030V110 CAVOK 16/14 Q1016\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"10:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"10\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"7:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"07\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"18\", \"tempi\":\"64\",\"dewptm\":\"13\", \"dewpti\":\"56\",\"hum\":\"67\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"50\",\"wdire\":\"NE\",\"vism\":\"20\", \"visi\":\"12\",\"pressurem\":\"1015\", \"pressurei\":\"29.99\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Clear\",\"icon\":\"clear\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01071 15120 22998 60502 10178 20131 39676 40154 52005 80006 333 55310 00828 21721\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"10:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"10\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"7:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"07\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"18.0\", \"tempi\":\"64.4\",\"dewptm\":\"15.0\", \"dewpti\":\"59.0\",\"hum\":\"83\",\"wspdm\":\"9.3\", \"wspdi\":\"5.8\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"50\",\"wdire\":\"NE\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1016\", \"pressurei\":\"30.01\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010700Z 05005KT 360V090 9999 FEW030 18/15 Q1016\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"10:30 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"10\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"7:30 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"07\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"19.0\", \"tempi\":\"66.2\",\"dewptm\":\"16.0\", \"dewpti\":\"60.8\",\"hum\":\"83\",\"wspdm\":\"9.3\", \"wspdi\":\"5.8\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"60\",\"wdire\":\"ENE\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1016\", \"pressurei\":\"30.01\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010730Z 06005KT 010V100 9999 FEW030 19/16 Q1016\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"11:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"11\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"8:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"08\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"19\", \"tempi\":\"66\",\"dewptm\":\"14\", \"dewpti\":\"57\",\"hum\":\"65\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"50\",\"wdire\":\"NE\",\"vism\":\"20\", \"visi\":\"12\",\"pressurem\":\"1015\", \"pressurei\":\"29.99\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Scattered Clouds\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01081 15120 22698 70502 10191 20139 39677 40153 52006 81108 333 55310 01333 22342\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"11:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"11\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"8:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"08\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"20.0\", \"tempi\":\"68.0\",\"dewptm\":\"15.0\", \"dewpti\":\"59.0\",\"hum\":\"73\",\"wspdm\":\"7.4\", \"wspdi\":\"4.6\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1016\", \"pressurei\":\"30.01\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010800Z VRB04KT 9999 FEW033 20/15 Q1016\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"11:30 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"11\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"8:30 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"08\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"21.0\", \"tempi\":\"69.8\",\"dewptm\":\"16.0\", \"dewpti\":\"60.8\",\"hum\":\"73\",\"wspdm\":\"3.7\", \"wspdi\":\"2.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1016\", \"pressurei\":\"30.01\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010830Z VRB02KT 9999 FEW033 21/16 Q1016\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"12:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"12\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"9:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"09\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"22\", \"tempi\":\"72\",\"dewptm\":\"15\", \"dewpti\":\"59\",\"hum\":\"55\",\"wspdm\":\"3.6\", \"wspdi\":\"2.2\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"70\",\"wdire\":\"ENE\",\"vism\":\"20\", \"visi\":\"12\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Scattered Clouds\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01091 15120 22698 70701 10221 20152 39680 40151 52007 81248 333 55310 01801 22742\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"12:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"12\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"9:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"09\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"22.0\", \"tempi\":\"71.6\",\"dewptm\":\"16.0\", \"dewpti\":\"60.8\",\"hum\":\"69\",\"wspdm\":\"7.4\", \"wspdi\":\"4.6\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1016\", \"pressurei\":\"30.01\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010900Z VRB04KT 9999 FEW033 22/16 Q1016\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"12:30 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"12\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"9:30 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"09\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"23.0\", \"tempi\":\"73.4\",\"dewptm\":\"14.0\", \"dewpti\":\"57.2\",\"hum\":\"57\",\"wspdm\":\"7.4\", \"wspdi\":\"4.6\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"60\",\"wdire\":\"ENE\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 010930Z 06004KT 340V120 9999 FEW035 23/14 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"1:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"13\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"10:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"10\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"23\", \"tempi\":\"74\",\"dewptm\":\"12\", \"dewpti\":\"54\",\"hum\":\"39\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"50\",\"wdire\":\"NE\",\"vism\":\"20\", \"visi\":\"12\",\"pressurem\":\"1014\", \"pressurei\":\"29.96\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Scattered Clouds\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01101 15120 22698 50502 10232 20122 39675 40144 50001 81248 333 55310 02162 23020\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"1:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"13\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"10:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"10\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"23.0\", \"tempi\":\"73.4\",\"dewptm\":\"13.0\", \"dewpti\":\"55.4\",\"hum\":\"53\",\"wspdm\":\"5.6\", \"wspdi\":\"3.5\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"80\",\"wdire\":\"East\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011000Z 08003KT 030V140 9999 FEW038 23/13 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"1:30 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"13\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"10:30 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"10\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"24.0\", \"tempi\":\"75.2\",\"dewptm\":\"13.0\", \"dewpti\":\"55.4\",\"hum\":\"50\",\"wspdm\":\"5.6\", \"wspdi\":\"3.5\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"80\",\"wdire\":\"East\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011030Z 08003KT 9999 FEW042 24/13 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"2:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"14\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"11:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"11\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"24\", \"tempi\":\"75\",\"dewptm\":\"11\", \"dewpti\":\"52\",\"hum\":\"34\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"150\",\"wdire\":\"SSE\",\"vism\":\"20\", \"visi\":\"12\",\"pressurem\":\"1014\", \"pressurei\":\"29.95\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Scattered Clouds\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01111 15120 22698 41502 10237 20111 39673 40142 58003 82231 333 55304 01359 22031\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"2:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"14\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"11:00 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"11\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"25.0\", \"tempi\":\"77.0\",\"dewptm\":\"11.0\", \"dewpti\":\"51.8\",\"hum\":\"41\",\"wspdm\":\"3.7\", \"wspdi\":\"2.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011100Z VRB02KT 9999 FEW046 25/11 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"2:30 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"14\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"11:30 AM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"11\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"25.0\", \"tempi\":\"77.0\",\"dewptm\":\"11.0\", \"dewpti\":\"51.8\",\"hum\":\"41\",\"wspdm\":\"7.4\", \"wspdi\":\"4.6\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Scattered Clouds\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011130Z VRB04KT 9999 FEW046CB SCT052 25/11 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"3:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"15\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"12:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"12\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"24\", \"tempi\":\"76\",\"dewptm\":\"10\", \"dewpti\":\"51\",\"hum\":\"31\",\"wspdm\":\"3.6\", \"wspdi\":\"2.2\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"100\",\"wdire\":\"East\",\"vism\":\"20\", \"visi\":\"12\",\"pressurem\":\"1014\", \"pressurei\":\"29.94\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Scattered Clouds\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01121 15120 02698 41001 10245 20105 39670 40137 57010 60001 82231 333 55310 02137 22996\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"3:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"15\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"12:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"12\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"25.0\", \"tempi\":\"77.0\",\"dewptm\":\"10.0\", \"dewpti\":\"50.0\",\"hum\":\"39\",\"wspdm\":\"3.7\", \"wspdi\":\"2.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1014\", \"pressurei\":\"29.95\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011200Z VRB02KT 9999 FEW048TCU 25/10 Q1014\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"3:30 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"15\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"12:30 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"12\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"25.0\", \"tempi\":\"77.0\",\"dewptm\":\"10.0\", \"dewpti\":\"50.0\",\"hum\":\"39\",\"wspdm\":\"3.7\", \"wspdi\":\"2.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1014\", \"pressurei\":\"29.95\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011230Z VRB02KT 9999 FEW050 25/10 Q1014\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"4:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"16\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"1:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"13\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"25\", \"tempi\":\"77\",\"dewptm\":\"10\", \"dewpti\":\"50\",\"hum\":\"28\",\"wspdm\":\"3.6\", \"wspdi\":\"2.2\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"30\",\"wdire\":\"NNE\",\"vism\":\"20\", \"visi\":\"12\",\"pressurem\":\"1013\", \"pressurei\":\"29.91\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01131 15120 22598 60301 10248 20100 39663 40129 58012 83371 333 55306 01566 22345\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"4:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"16\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"1:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"13\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"25.0\", \"tempi\":\"77.0\",\"dewptm\":\"8.0\", \"dewpti\":\"46.4\",\"hum\":\"34\",\"wspdm\":\"5.6\", \"wspdi\":\"3.5\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1014\", \"pressurei\":\"29.95\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Scattered Clouds\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011300Z VRB03KT 9999 FEW050CB SCT060 25/08 Q1014\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"4:30 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"16\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"1:30 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"13\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"25.0\", \"tempi\":\"77.0\",\"dewptm\":\"9.0\", \"dewpti\":\"48.2\",\"hum\":\"36\",\"wspdm\":\"1.9\", \"wspdi\":\"1.2\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1014\", \"pressurei\":\"29.95\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Scattered Clouds\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011330Z VRB01KT 9999 FEW048CB SCT060 25/09 Q1014\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"5:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"17\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"2:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"14\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"19\", \"tempi\":\"66\",\"dewptm\":\"13\", \"dewpti\":\"56\",\"hum\":\"62\",\"wspdm\":\"21.6\", \"wspdi\":\"13.4\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"290\",\"wdire\":\"WNW\",\"vism\":\"10\", \"visi\":\"6\",\"pressurem\":\"1015\", \"pressurei\":\"29.97\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Mostly Cloudy\",\"icon\":\"mostlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01141 15120 22597 72906 10191 20133 39671 40147 55002 85970 333 55300 00478 20849\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"5:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"17\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"2:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"14\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"20.0\", \"tempi\":\"68.0\",\"dewptm\":\"13.0\", \"dewpti\":\"55.4\",\"hum\":\"64\",\"wspdm\":\"27.8\", \"wspdi\":\"17.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"260\",\"wdire\":\"West\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Mostly Cloudy\",\"icon\":\"mostlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011400Z 26015KT 9999 SCT042CB BKN065 20/13 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"5:30 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"17\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"2:30 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"14\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"21.0\", \"tempi\":\"69.8\",\"dewptm\":\"14.0\", \"dewpti\":\"57.2\",\"hum\":\"64\",\"wspdm\":\"20.4\", \"wspdi\":\"12.7\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"270\",\"wdire\":\"West\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Scattered Clouds\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011430Z 27011KT 240V300 9999 FEW050CB SCT068 21/14 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"6:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"18\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"3:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"15\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"19\", \"tempi\":\"66\",\"dewptm\":\"14\", \"dewpti\":\"56\",\"hum\":\"63\",\"wspdm\":\"10.8\", \"wspdi\":\"6.7\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"270\",\"wdire\":\"West\",\"vism\":\"10\", \"visi\":\"6\",\"pressurem\":\"1014\", \"pressurei\":\"29.96\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Light Rain Showers\",\"icon\":\"rain\",\"fog\":\"0\",\"rain\":\"1\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01151 15120 21597 62703 10189 20135 39668 40144 55002 72582 83363 333 55302 00214 20915\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"6:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"18\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"3:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"15\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"20.0\", \"tempi\":\"68.0\",\"dewptm\":\"13.0\", \"dewpti\":\"55.4\",\"hum\":\"64\",\"wspdm\":\"20.4\", \"wspdi\":\"12.7\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"280\",\"wdire\":\"West\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Scattered Clouds\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011500Z 28011KT 9999 FEW055CB SCT068 20/13 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"6:30 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"18\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"3:30 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"15\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"20.0\", \"tempi\":\"68.0\",\"dewptm\":\"13.0\", \"dewpti\":\"55.4\",\"hum\":\"64\",\"wspdm\":\"13.0\", \"wspdi\":\"8.1\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"260\",\"wdire\":\"West\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1015\", \"pressurei\":\"29.98\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Mostly Cloudy\",\"icon\":\"mostlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011530Z 26007KT 9999 FEW055CB BKN068 20/13 Q1015\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"7:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"19\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"4:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"16\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"18\", \"tempi\":\"64\",\"dewptm\":\"14\", \"dewpti\":\"57\",\"hum\":\"73\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"250\",\"wdire\":\"WSW\",\"vism\":\"10\", \"visi\":\"6\",\"pressurem\":\"1015\", \"pressurei\":\"29.96\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01161 15120 22597 72502 10178 20141 39668 40146 50005 84363 333 55300 00178 20408\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"7:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"19\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"4:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"16\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"19.0\", \"tempi\":\"66.2\",\"dewptm\":\"13.0\", \"dewpti\":\"55.4\",\"hum\":\"68\",\"wspdm\":\"13.0\", \"wspdi\":\"8.1\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"280\",\"wdire\":\"West\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1014\", \"pressurei\":\"29.95\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Mostly Cloudy\",\"icon\":\"mostlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011600Z 28007KT 9999 FEW055CB BKN068 19/13 Q1014\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"7:30 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"19\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"4:30 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"16\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"19.0\", \"tempi\":\"66.2\",\"dewptm\":\"13.0\", \"dewpti\":\"55.4\",\"hum\":\"68\",\"wspdm\":\"7.4\", \"wspdi\":\"4.6\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"290\",\"wdire\":\"WNW\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1014\", \"pressurei\":\"29.95\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Scattered Clouds\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011630Z 29004KT 250V330 9999 FEW055CB SCT068 19/13 Q1014\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"8:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"20\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"5:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"17\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"18\", \"tempi\":\"64\",\"dewptm\":\"15\", \"dewpti\":\"59\",\"hum\":\"77\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"320\",\"wdire\":\"NW\",\"vism\":\"20\", \"visi\":\"12\",\"pressurem\":\"1014\", \"pressurei\":\"29.95\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Overcast\",\"icon\":\"cloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01171 15120 22598 83202 10176 20148 39663 40141 58008 8337/ 333 55300 00003 20162\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"8:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"20\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"5:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"17\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"19.0\", \"tempi\":\"66.2\",\"dewptm\":\"13.0\", \"dewpti\":\"55.4\",\"hum\":\"68\",\"wspdm\":\"7.4\", \"wspdi\":\"4.6\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"250\",\"wdire\":\"WSW\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1014\", \"pressurei\":\"29.95\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011700Z 25004KT 9999 FEW055CB 19/13 Q1014\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"8:30 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"20\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"5:30 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"17\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"18.0\", \"tempi\":\"64.4\",\"dewptm\":\"14.0\", \"dewpti\":\"57.2\",\"hum\":\"77\",\"wspdm\":\"0.0\", \"wspdi\":\"0.0\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"North\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1014\", \"pressurei\":\"29.95\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011730Z 00000KT 9999 FEW060 18/14 Q1014\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"9:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"21\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"6:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"18\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"17\", \"tempi\":\"63\",\"dewptm\":\"15\", \"dewpti\":\"58\",\"hum\":\"80\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"240\",\"wdire\":\"WSW\",\"vism\":\"20\", \"visi\":\"12\",\"pressurem\":\"1014\", \"pressurei\":\"29.94\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01181 15120 01598 62402 10171 20147 39659 40138 58009 69922 70282 82370 333 10259 20167 30049 55300 10088 20155\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"9:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"21\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"6:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"18\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"18.0\", \"tempi\":\"64.4\",\"dewptm\":\"14.0\", \"dewpti\":\"57.2\",\"hum\":\"77\",\"wspdm\":\"5.6\", \"wspdi\":\"3.5\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"300\",\"wdire\":\"WNW\",\"vism\":\"10.0\", \"visi\":\"6.2\",\"pressurem\":\"1013\", \"pressurei\":\"29.92\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Partly Cloudy\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011800Z 30003KT 9999 FEW060 18/14 Q1013\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"9:30 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"21\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"6:30 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"18\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"18.0\", \"tempi\":\"64.4\",\"dewptm\":\"14.0\", \"dewpti\":\"57.2\",\"hum\":\"77\",\"wspdm\":\"3.7\", \"wspdi\":\"2.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"310\",\"wdire\":\"NW\",\"vism\":\"-9999.0\", \"visi\":\"-9999.0\",\"pressurem\":\"1013\", \"pressurei\":\"29.92\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Clear\",\"icon\":\"clear\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011830Z 31002KT CAVOK 18/14 Q1013\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"10:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"22\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"7:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"19\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"16\", \"tempi\":\"61\",\"dewptm\":\"15\", \"dewpti\":\"59\",\"hum\":\"90\",\"wspdm\":\"3.6\", \"wspdi\":\"2.2\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"270\",\"wdire\":\"West\",\"vism\":\"10\", \"visi\":\"6\",\"pressurem\":\"1013\", \"pressurei\":\"29.93\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Scattered Clouds\",\"icon\":\"partlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01191 15120 22597 72701 10162 20149 39654 40134 57014 82370 333 55300 10116 20017\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"10:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"22\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"7:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"19\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"17.0\", \"tempi\":\"62.6\",\"dewptm\":\"15.0\", \"dewpti\":\"59.0\",\"hum\":\"88\",\"wspdm\":\"3.7\", \"wspdi\":\"2.3\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"280\",\"wdire\":\"West\",\"vism\":\"-9999.0\", \"visi\":\"-9999.0\",\"pressurem\":\"1013\", \"pressurei\":\"29.92\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Clear\",\"icon\":\"clear\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011900Z 28002KT CAVOK 17/15 Q1013\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"10:30 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"22\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"7:30 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"19\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"16.0\", \"tempi\":\"60.8\",\"dewptm\":\"14.0\", \"dewpti\":\"57.2\",\"hum\":\"88\",\"wspdm\":\"5.6\", \"wspdi\":\"3.5\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"30\",\"wdire\":\"NNE\",\"vism\":\"-9999.0\", \"visi\":\"-9999.0\",\"pressurem\":\"1013\", \"pressurei\":\"29.92\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Clear\",\"icon\":\"clear\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 011930Z 03003KT 350V050 CAVOK 16/14 Q1013\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"11:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"23\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"8:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"20\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"15\", \"tempi\":\"60\",\"dewptm\":\"14\", \"dewpti\":\"57\",\"hum\":\"88\",\"wspdm\":\"7.2\", \"wspdi\":\"4.5\",\"wgustm\":\"\", \"wgusti\":\"\",\"wdird\":\"280\",\"wdire\":\"West\",\"vism\":\"10\", \"visi\":\"6\",\"pressurem\":\"1013\", \"pressurei\":\"29.93\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"\", \"precipi\":\"\",\"conds\":\"Mostly Cloudy\",\"icon\":\"mostlycloudy\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"AAXX 01201 15120 22997 72802 10153 20141 39652 40134 56010 87070 333 55300 10131 20000\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"11:00 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"23\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"8:00 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"20\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"16.0\", \"tempi\":\"60.8\",\"dewptm\":\"14.0\", \"dewpti\":\"57.2\",\"hum\":\"88\",\"wspdm\":\"0.0\", \"wspdi\":\"0.0\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"North\",\"vism\":\"-9999.0\", \"visi\":\"-9999.0\",\"pressurem\":\"1013\", \"pressurei\":\"29.92\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Clear\",\"icon\":\"clear\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 012000Z 00000KT CAVOK 16/14 Q1013\" },\n" +
            "\t\t{\n" +
            "\t\t\"date\": {\n" +
            "\t\t\"pretty\": \"11:30 PM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"23\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"utcdate\": {\n" +
            "\t\t\"pretty\": \"8:30 PM GMT on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"20\",\n" +
            "\t\t\"min\": \"30\",\n" +
            "\t\t\"tzname\": \"UTC\"\n" +
            "\t\t},\n" +
            "\t\t\"tempm\":\"16.0\", \"tempi\":\"60.8\",\"dewptm\":\"14.0\", \"dewpti\":\"57.2\",\"hum\":\"88\",\"wspdm\":\"1.9\", \"wspdi\":\"1.2\",\"wgustm\":\"-9999.0\", \"wgusti\":\"-9999.0\",\"wdird\":\"0\",\"wdire\":\"Variable\",\"vism\":\"-9999.0\", \"visi\":\"-9999.0\",\"pressurem\":\"1013\", \"pressurei\":\"29.92\",\"windchillm\":\"-999\", \"windchilli\":\"-999\",\"heatindexm\":\"-9999\", \"heatindexi\":\"-9999\",\"precipm\":\"-9999.00\", \"precipi\":\"-9999.00\",\"conds\":\"Clear\",\"icon\":\"clear\",\"fog\":\"0\",\"rain\":\"0\",\"snow\":\"0\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"metar\":\"METAR LRCL 012030Z VRB01KT CAVOK 16/14 Q1013\" }\n" +
            "\t\t],\n" +
            "\t\t\"dailysummary\": [\n" +
            "\t\t{ \"date\": {\n" +
            "\t\t\"pretty\": \"12:00 AM EEST on June 01, 2016\",\n" +
            "\t\t\"year\": \"2016\",\n" +
            "\t\t\"mon\": \"06\",\n" +
            "\t\t\"mday\": \"01\",\n" +
            "\t\t\"hour\": \"00\",\n" +
            "\t\t\"min\": \"00\",\n" +
            "\t\t\"tzname\": \"Europe/Bucharest\"\n" +
            "\t\t},\n" +
            "\t\t\"fog\":\"1\",\"rain\":\"1\",\"snow\":\"0\",\"snowfallm\":\"\", \"snowfalli\":\"\",\"monthtodatesnowfallm\":\"\", \"monthtodatesnowfalli\":\"\",\"since1julsnowfallm\":\"\", \"since1julsnowfalli\":\"\",\"snowdepthm\":\"\", \"snowdepthi\":\"\",\"hail\":\"0\",\"thunder\":\"0\",\"tornado\":\"0\",\"meantempm\":\"18\", \"meantempi\":\"64\",\"meandewptm\":\"13\", \"meandewpti\":\"55\",\"meanpressurem\":\"1014.75\", \"meanpressurei\":\"29.97\",\"meanwindspdm\":\"6\", \"meanwindspdi\":\"4\",\"meanwdire\":\"NNW\",\"meanwdird\":\"336\",\"meanvism\":\"11.7\", \"meanvisi\":\"7.1\",\"humidity\":\"75\",\"maxtempm\":\"25\", \"maxtempi\":\"78\",\"mintempm\":\"10\", \"mintempi\":\"51\",\"maxhumidity\":\"100\",\"minhumidity\":\"28\",\"maxdewptm\":\"16\", \"maxdewpti\":\"61\",\"mindewptm\":\"8\", \"mindewpti\":\"46\",\"maxpressurem\":\"1016\", \"maxpressurei\":\"30.01\",\"minpressurem\":\"1013\", \"minpressurei\":\"29.91\",\"maxwspdm\":\"28\", \"maxwspdi\":\"17\",\"minwspdm\":\"0\", \"minwspdi\":\"0\",\"maxvism\":\"20.0\", \"maxvisi\":\"12.0\",\"minvism\":\"0.6\", \"minvisi\":\"0.4\",\"gdegreedays\":\"14\",\"heatingdegreedays\":\"0\",\"coolingdegreedays\":\"0\",\"precipm\":\"0.2\", \"precipi\":\"0.01\",\"precipsource\":\"Precip6GroupSynop\",\"heatingdegreedaysnormal\":\"\",\"monthtodateheatingdegreedays\":\"\",\"monthtodateheatingdegreedaysnormal\":\"\",\"since1sepheatingdegreedays\":\"\",\"since1sepheatingdegreedaysnormal\":\"\",\"since1julheatingdegreedays\":\"\",\"since1julheatingdegreedaysnormal\":\"\",\"coolingdegreedaysnormal\":\"\",\"monthtodatecoolingdegreedays\":\"\",\"monthtodatecoolingdegreedaysnormal\":\"\",\"since1sepcoolingdegreedays\":\"\",\"since1sepcoolingdegreedaysnormal\":\"\",\"since1jancoolingdegreedays\":\"\",\"since1jancoolingdegreedaysnormal\":\"\" }\n" +
            "\t\t]\n" +
            "\t}\n" +
            "}";
}
