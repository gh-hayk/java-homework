package bank_system.appointments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppointmentManager {
    private List<Appointment> appointments;

    public AppointmentManager(){
        this.appointments = new ArrayList<>();
    }
    public List<Appointment> viewAllAppointments(){
        return appointments;
    }
    public Appointment getNextAppointment() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return null;
        }
    return appointments.stream()
            .min(Comparator.comparingInt(Appointment::getPriority))
            .orElse(null);
    }
    public void scheduleAppointment(Appointment appointment){
        appointments.add(appointment);
        System.out.println("Appointment scheduled for: " + appointment.getCustomerName());
    }
    public void printAllAppointments(){
        if (appointments.isEmpty()){
            System.out.println("No appointments");
            return;
        }
        System.out.println("All Appointments");
        for (Appointment a : appointments){
            System.out.println(a);
        }
    }

}
