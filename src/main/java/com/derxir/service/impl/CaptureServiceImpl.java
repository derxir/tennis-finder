package com.derxir.service.impl;

import com.derxir.domain.*;
import com.derxir.domain.framework.Component;
import com.derxir.service.CaptureService;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * Created by justin on 4/5/17.
 */
@Service
public class CaptureServiceImpl implements CaptureService {

    private static Logger LOG = Logger.getLogger(CaptureService.class);

    Map<String, Component> componentMap = new HashMap<>();

    @Override
    public void initCapture() {
        new CaptureContext();

    }

    @Override
    public CaptureContext loadCourtStatusInfo() {
        return null;
    }


    @Override
    public void start() {
        LOG.info("start service");

    }

    @Override
    public void stop() {
        LOG.info("stop service");

    }

    public static void main(String args[]) throws IOException, NoSuchFieldException {

        URL url = new URL("http://uk.bookingbug.com/book/all/w981356?height=570&iframe=bb_all_ukw981356_3719&palette=THT+Test&service=28748&style=medium&width=580&category=");

        Document doc = Jsoup.connect(url.toString()).get();

        CaptureContext context = new CaptureContext();
        CourtInfo info = new CourtInfo("poplar court","E13 Ead","test");
        CourtStatus courtStatus = new CourtStatus();
        Court court = new Court(info, url, courtStatus);

        context.addCourt(court);
        //TODO generify the logic here
        Elements calendar = doc.getElementsByClass("cal_dbody").get(0).getElementsByClass("cal_day");
        int days = calendar.size();
        for( int i = 0; i < days; i++){
            Element dailySlots = calendar.get(i);
            Elements inc = dailySlots.getElementsByClass("inc");
            String rawDate = inc.get(0).childNode(0).getClass().getDeclaredField("text").toString();
            courtStatus.setDate(new Date()); // TODO need to resolve text
            List<Slot> slots  = new ArrayList<>();
            for (int slotIndex = 1; slotIndex < inc.size(); slotIndex++){
                Element element = inc.get(slotIndex);
                slots.add(new Slot(slotIndex, true)); // TODO resolve availability

            }
            courtStatus.getSlots().put(new Date(),slots);


        }

        System.out.println(context.toString());
    }

    private static void resolveAvailability() {
    }
}
