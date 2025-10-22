package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.util.EnumMap;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

        @Test
        void checkInWhenOccupiedAndDirty() {
            Room room = new Room(true,true,1,2,124);


            room.checkIn();
            boolean available = true;

            assertEquals(available,room.isAvailable());

        }

        @Test
        void checkInWhenOccupiedButNotDirty(){
            Room room = new Room(true,false,1,2,124);

            room.checkIn();
            boolean available = true;

            assertEquals(available,room.isAvailable());

        }

    @Test
    void checkOutWhenOccupiedAndDirty() {
        Room room = new Room(true,true,1,2,124);

        room.checkOut();
//        room.cleanRoom();

        boolean available = true;
        assertEquals(available,room.isAvailable());
    }

    @Test
    void cleanRoomIfOccupied() {
        Room room = new Room(true,true,1,2,124);

       boolean ableToBeCleaned = true;

        assertEquals(ableToBeCleaned,room.cleanRoom());


    }
}