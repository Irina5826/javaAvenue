public class Hotel {
    Room[] freeRooms;
    int[] usedRooms;

    Hotel(Room[] rooms) {
        this.freeRooms = rooms;
        this.usedRooms = new int[rooms.length];
    }

    void getFreeRooms() {
        Room[] rooms = this.freeRooms;
        System.out.println("--Список свободных комнат--");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].roomNumber == 0) {
                continue;
            }
            System.out.println("Комната №" + rooms[i].roomNumber);
        }
        System.out.println("--Конец списка--");
    }

    void getUsedRooms() {
        int[] room = this.usedRooms;
        System.out.println("--Список занятых комнат--");
        for (int i = 0; i < room.length; i++) {
            if (room[i] == 0) {
                continue;
            }
            System.out.println("Комната №" + room[i]);
        }
        System.out.println("--Конец списка--");
    }

    void reservedRoom(int needRoom) {
        Room[] freeRooms = this.freeRooms;
        for (int i = 0; i < freeRooms.length; i++) {
            if (needRoom == freeRooms[i].roomNumber) {
                freeRooms[i].roomNumber = 0;
                this.usedRooms[i] = needRoom;
                System.out.println("Комната № " + needRoom + " теперь забронирована");
                break;
            } else if (i + 1 == freeRooms.length) {
                System.out.println("такой комнаты не найдено");
            }

        }
    }

    void getRoomsWithEat() {
        Room[] rooms = this.freeRooms;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].eat && rooms[i].roomNumber != 0) {
                System.out.println("комната с едой " + rooms[i].roomNumber);

            }
        }

    }

    void getRoomsWithShower() {
        Room[] rooms = this.freeRooms;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].shower && rooms[i].roomNumber != 0) {
                System.out.println("комната с душем " + rooms[i].roomNumber);
            }
        }
    }
    void getRoomsWithToilet() {
        Room[] rooms = this.freeRooms;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].toilet && rooms[i].roomNumber != 0) {
                System.out.println("комната с туалетом " + rooms[i].roomNumber);
            }
        }
    }
    void getRoomsWithWifi() {
        Room[] rooms = this.freeRooms;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].wifi && rooms[i].roomNumber != 0) {
                System.out.println("комната с туалетом " + rooms[i].roomNumber);
            }
        }
    }
}
