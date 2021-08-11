package com.builder;

import com.builder.builders.CarBuilder;
import com.builder.builders.CarManualBuilder;
import com.builder.cars.Car;
import com.builder.cars.Manual;
import com.builder.director.Director;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		
		CarBuilder builder = new CarBuilder();
		director.constructSportCar(builder);
		
		Car car = builder.getResult();
		System.out.println("Car built:\n" + car.getCarType());
		
		CarManualBuilder manualBuilder = new CarManualBuilder();
		
		director.constructSportCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\nCar Manual built:\n" + carManual.print());
	}

}
