package booking;

import java.util.*;

import enums.BookingStatus;
import movie.Show;
import movie.ShowSeat;
import payment.Payment;

public class Booking {
    private String bookingNumber;
    private int numberOfSeats;
    private Date createdOn;
    private BookingStatus status;

    private Show show;
    private List<ShowSeat> seats;
    private Payment payment;

    /*
     * Make payment for outstanding amount
     */
    public boolean makePayment(Payment payment) {
        return false;

    }

    /**
     * Cancel existing booking
     * 
     * @return
     */
    public boolean cancel() {
        return false;

    }

    /**
     * @param seats
     *              allocate the seat.
     * @return
     */
    public boolean assignSeats(List<ShowSeat> seats) {
        return false;

    }
}
