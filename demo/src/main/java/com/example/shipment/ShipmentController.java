package com.example.shipment;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/shipments")
public class ShipmentController {

    private final ShipmentServive shipmentServive;

    @PostMapping("path")
    public ResponseEntity <Shipment> createShipment() {
        Shipment  shipment = shipmentServive.createShipment();
        return ResponseEntity.status(HttpStatus.CREATED).body(shipment);
    
    }
    
}
 