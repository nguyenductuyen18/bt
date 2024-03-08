package com.codegym.demo26.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id ;
        private String name;
        private String manufacturer;
        private String computerType;
        private String operatingSystem;
        private String CPU;

        private String RAM;
        private String internalMemory;
        private String Card;
        private String screen;
        private String dateOfManufacture;
        private String status;
        private String machineDescription;

        public Computer() {
        }

        public Computer(int id, String name, String manufacturer, String computerType, String operatingSystem, String CPU, String RAM, String internalMemory, String card, String screen, String dateOfManufacture, String status, String machineDescription) {
                this.id = id;
                this.name = name;
                this.manufacturer = manufacturer;
                this.computerType = computerType;
                this.operatingSystem = operatingSystem;
                this.CPU = CPU;
                this.RAM = RAM;
                this.internalMemory = internalMemory;
                Card = card;
                this.screen = screen;
                this.dateOfManufacture = dateOfManufacture;
                this.status = status;
                this.machineDescription = machineDescription;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getManufacturer() {
                return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
        }

        public String getComputerType() {
                return computerType;
        }

        public void setComputerType(String computerType) {
                this.computerType = computerType;
        }

        public String getOperatingSystem() {
                return operatingSystem;
        }

        public void setOperatingSystem(String operatingSystem) {
                this.operatingSystem = operatingSystem;
        }

        public String getCPU() {
                return CPU;
        }

        public void setCPU(String CPU) {
                this.CPU = CPU;
        }

        public String getRAM() {
                return RAM;
        }

        public void setRAM(String RAM) {
                this.RAM = RAM;
        }

        public String getInternalMemory() {
                return internalMemory;
        }

        public void setInternalMemory(String internalMemory) {
                this.internalMemory = internalMemory;
        }

        public String getCard() {
                return Card;
        }

        public void setCard(String card) {
                Card = card;
        }

        public String getScreen() {
                return screen;
        }

        public void setScreen(String screen) {
                this.screen = screen;
        }

        public String getDateOfManufacture() {
                return dateOfManufacture;
        }

        public void setDateOfManufacture(String dateOfManufacture) {
                this.dateOfManufacture = dateOfManufacture;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public String getMachineDescription() {
                return machineDescription;
        }

        public void setMachineDescription(String machineDescription) {
                this.machineDescription = machineDescription;
        }
}
