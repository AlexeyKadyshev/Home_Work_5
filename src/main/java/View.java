package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {


    void showTables(Collection<Table> tables);


    void setObserver(ViewObserver observer);


    void reservationTable(Date reservationDate, int tableNo, String name);


    void showReservationTableResult(int reservationId);


    void changeReservationTable(int oldReservationTable, Date reservationDate, int tableNo, String name);


    void showChangeReservationTableResult(int oldResevationId, int newReservationId);
}