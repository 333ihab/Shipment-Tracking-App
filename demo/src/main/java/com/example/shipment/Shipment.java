package com.example.shipment;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity(name="shipment")
public class Shipment {
    @Id
    @GeneratedValue
    private  Long id;

    @Column(nullable=false, unique=true)
    private String trackingNum;

    @Column(nullable = false)
    private String origin;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ShipmentStatus status;

    @Column(nullable = false)
    private String destination;



    @Column(nullable= false)
    private LocalDateTime createdAt;

    @Column(nullable= false)
    private LocalDateTime updatedAt;


    private String currentLocation;

    private String estimatedDelivery;


    @PrePersist
    protected void onCreate(){
        createdAt=LocalDateTime.now();
        updatedAt=LocalDateTime.now();
            if (status==null){
                status= ShipmentStatus.ORDER_PLACED;
            }
    }


    @PreUpdate
    protected void onUpdate(){
        updatedAt= LocalDateTime.now();


    }


}
