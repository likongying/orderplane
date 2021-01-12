package ui;

import cn.edu.hcnu.bean.Flight;
import imp.FlightServiceImpl;
import imp.IFlightService;
/*import impl1.FlightServiceImpl;
import impl1.IFlightService;*/

import java.util.Scanner;
import java.util.UUID;

public class MainUI {
    public static  void main(){
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("请输入相应的数字进行操作");
            System.out.println("按1，进入录入航班信息");
            System.out.println("按2 ,显示航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预订");
            System.out.println("按5，机票退订");
            System.out.println("按6，退出系统");

            String id= UUID.randomUUID().toString();
            System.out.println(id.replace("-",""));
            System.out.print("请输入航班编号：");
            String flightId=sc.next();
            System.out.print("请输入机型：");
            String planeType=sc.next();
            System.out.print("请输入座位号：");
            int currentSeatsNum=sc.nextInt();
            System.out.print("请输入起飞机场：");
            String  departureAirport=sc.next();
            System.out.print("请输入目的机场：");
            String  destinationAirport=sc.next();
            System.out.print("请输入起飞时间：");
            String  departureTime=sc.next();
            Flight flight=new Flight(id,flightId, planeType,currentSeatsNum,departureAirport, destinationAirport,departureTime);
            IFlightService iFlightService=new FlightServiceImpl();
            iFlightService.insertFlight(flight);


        }

}}
