package com.example.shipment;


import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public  class ShipmentServive {
    //data injection
    private final ShipmentRepository shipmentRepository;
    
    public Shipment createShipment(){
        Shipment shipment= Shipment.builder()
        .trackingNum("TRACK123456")
        .origin("New York")
        .destination("Los Angeles")
        .build();
        
        
        shipmentRepository.save(shipment);

        return shipment;
    }




}
