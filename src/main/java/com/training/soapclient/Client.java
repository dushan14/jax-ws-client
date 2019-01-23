package com.training.soapclient;

import com.training.suntravels.Hotel;
import com.training.suntravels.TravelService;
import com.training.suntravels.TravelServiceService;


import java.util.List;

public class Client {

    public static void main(String[] args) {

        TravelService travelService = new TravelServiceService().getTravelServicePort();

        // get all
        List<Hotel> hotels = travelService.getHotels();
        System.out.println("all hotels: "+hotels);


        // save new
        Hotel hotel=new Hotel();
        hotel.setId( 21 );
        hotel.setName("Galadari 2");
        hotel.setAddress("No:2,Colombo");
        hotel.setStarRating( 5 );

        travelService.saveHotel( hotel );

    }
}
