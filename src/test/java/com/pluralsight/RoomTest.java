package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.util.EnumMap;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

        @Test
        void check_in_when_occupied_and_dirty() {
            Room room = new Room(true,true,1,2,124);


            room.checkIn();
            boolean available = true;

            assertEquals(available,room.isAvailable());

        }

        @Test
        void check_in_when_occupied_but_not_dirty(){
            Room room = new Room(true,false,1,2,124);

            room.checkIn();
            boolean available = true;

            assertEquals(available,room.isAvailable());

        }

    @Test
    void check_out_when_occupied_and_dirty() {
        Room room = new Room(true,true,1,2,124);

        room.checkOut();
//        room.cleanRoom();

        boolean available = true;
        assertEquals(available,room.isAvailable());
    }

    @Test
    void clean_room_if_occupied() {
        Room room = new Room(true,true,1,2,124);

       boolean ableToBeCleaned = true;

        assertEquals(ableToBeCleaned,room.cleanRoom());


    }
}