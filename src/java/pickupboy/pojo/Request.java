package pickupboy.pojo;

import java.sql.Date;

public class Request {

     private static String req_id;
     private static Date req_date;
     private static String contact_no;
     private static String cust_id;
     private static String add_no;
     private static String req_type;
     private static Date Schedule_date;
     private static String add_info;
    public static String getReq_id() {
        return req_id;
    }

    public static void setReq_id(String req_id) {
        Request.req_id = req_id;
    }

    public static Date getReq_date() {
        return req_date;
    }

    public static void setReq_date(Date req_date) {
        Request.req_date = req_date;
    }

    public static String getContact_no() {
        return contact_no;
    }

    public static void setContact_no(String contact_no) {
        Request.contact_no = contact_no;
    }

    public static String getCust_id() {
        return cust_id;
    }

    public static void setCust_id(String cust_id) {
        Request.cust_id = cust_id;
    }

    public static String getAdd_no() {
        return add_no;
    }

    public static void setAdd_no(String add_no) {
        Request.add_no = add_no;
    }

    public static String getReq_type() {
        return req_type;
    }

    public static void setReq_type(String req_type) {
        Request.req_type = req_type;
    }

    public static Date getSchedule_date() {
        return Schedule_date;
    }

    public static void setSchedule_date(Date Schedule_date) {
        Request.Schedule_date = Schedule_date;
    }

    public static String getAdd_info() {
        return add_info;
    }

    public static void setAdd_info(String add_info) {
        Request.add_info = add_info;
    }
     
}
