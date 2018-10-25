package com.power.bank.dto;

import javax.persistence.Column;
import java.util.List;

public class PowerProductDto {

    private String name;

    /**
     * 1 Wireless chargers,2 Car Chargers,3 Single USB Chargers,4 Wall Chargers,5 Multi-function,6 Power Socket,
     */
    private String type;

    private String material;

    private String size;

    private String input;

    private String output;

    private String color;

    private String power;

    private String circuitProtections;

    private String dimension;

    private String service;

    private String port;

    private String pin;

    private String plug;

    private List<String> picture;

    public List<String> getPicture() {
        return picture;
    }

    public void setPicture(List<String> picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getCircuitProtections() {
        return circuitProtections;
    }

    public void setCircuitProtections(String circuitProtections) {
        this.circuitProtections = circuitProtections;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPlug() {
        return plug;
    }

    public void setPlug(String plug) {
        this.plug = plug;
    }

    @Override
    public String toString() {
        return "PowerProductDto{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", input='" + input + '\'' +
                ", output='" + output + '\'' +
                ", color='" + color + '\'' +
                ", power='" + power + '\'' +
                ", circuitProtections='" + circuitProtections + '\'' +
                ", dimension='" + dimension + '\'' +
                ", service='" + service + '\'' +
                ", port='" + port + '\'' +
                ", pin='" + pin + '\'' +
                ", plug='" + plug + '\'' +
                ", picture=" + picture +
                '}';
    }
}
