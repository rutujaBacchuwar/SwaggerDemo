package com.stackroute.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@Controller
@RequestMapping("/arrival")
@Api
public class ArrivalController {
	
	
   @ApiOperation(value = "Get all arrivals")
   @GetMapping(value = "all")
   public ResponseEntity<?> getAllArrivals() {
	   return new ResponseEntity("All Arivals",HttpStatus.OK);
   }

   @ApiOperation(value = "Get Flight Arrival")
   @GetMapping(value = "{id}")
   public ResponseEntity<?> getflightArrival(@PathVariable(value="id") String id) {
	   return new ResponseEntity(id,HttpStatus.OK);
   }

   @ApiOperation(value = "Get all arrivals from a city")
   @GetMapping(value = "/from/all")
   public ResponseEntity<?> getAllArrivalsfrom() {
	   return new ResponseEntity("All Arrivals from a city",HttpStatus.OK);
   }
   
}
