package bank_system.appointments;

import bank_system.enums.ServiceType;

public class Appointment {
    private String customerName;
    private ServiceType serviceType;
    private String preferredTime;
    private int priority;

    public Appointment(String customerName, ServiceType serviceType,String preferredTime,int priority){
        this.customerName = customerName;
        this.serviceType = serviceType;
        this.preferredTime = preferredTime;
        this.priority = priority;
    }

    public String getCustomerName() {
        return customerName;
    }
    public ServiceType getServiceType() {
        return serviceType;
    }
    public String getPreferredTime() {
       return preferredTime;
    }
    public int getPriority() {
        return priority;
    }
    @Override
    public String toString(){
        return "Customer " + customerName + " , Service " + serviceType + " , Time " + preferredTime + " , Priority " + priority;
    }

}
