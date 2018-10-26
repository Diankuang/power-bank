package com.power.bank.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_power_product")
public class TPowerProduct implements Serializable {
    @Id
    private String id;

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

    @Column(name = "circuit_protections")
    private String circuitProtections;

    private String dimension;

    private String service;

    private String port;

    private String pin;

    private String plug;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private Double price;

    private static final long serialVersionUID = 1L;

    /**
     * @return price
     */
    public Double getPrice() {
        return price;
    }
    /**
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取1 Wireless chargers,2 Car Chargers,3 Single USB Chargers,4 Wall Chargers,5 Multi-function,6 Power Socket,
     *
     * @return type - 1 Wireless chargers,2 Car Chargers,3 Single USB Chargers,4 Wall Chargers,5 Multi-function,6 Power Socket,
     */
    public String getType() {
        return type;
    }

    /**
     * 设置1 Wireless chargers,2 Car Chargers,3 Single USB Chargers,4 Wall Chargers,5 Multi-function,6 Power Socket,
     *
     * @param type 1 Wireless chargers,2 Car Chargers,3 Single USB Chargers,4 Wall Chargers,5 Multi-function,6 Power Socket,
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material
     */
    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    /**
     * @return size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    /**
     * @return input
     */
    public String getInput() {
        return input;
    }

    /**
     * @param input
     */
    public void setInput(String input) {
        this.input = input == null ? null : input.trim();
    }

    /**
     * @return output
     */
    public String getOutput() {
        return output;
    }

    /**
     * @param output
     */
    public void setOutput(String output) {
        this.output = output == null ? null : output.trim();
    }

    /**
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * @return power
     */
    public String getPower() {
        return power;
    }

    /**
     * @param power
     */
    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    /**
     * @return circuit_protections
     */
    public String getCircuitProtections() {
        return circuitProtections;
    }

    /**
     * @param circuitProtections
     */
    public void setCircuitProtections(String circuitProtections) {
        this.circuitProtections = circuitProtections == null ? null : circuitProtections.trim();
    }

    /**
     * @return dimension
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * @param dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension == null ? null : dimension.trim();
    }

    /**
     * @return service
     */
    public String getService() {
        return service;
    }

    /**
     * @param service
     */
    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    /**
     * @return port
     */
    public String getPort() {
        return port;
    }

    /**
     * @param port
     */
    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    /**
     * @return pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin == null ? null : pin.trim();
    }

    /**
     * @return plug
     */
    public String getPlug() {
        return plug;
    }

    /**
     * @param plug
     */
    public void setPlug(String plug) {
        this.plug = plug == null ? null : plug.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", material=").append(material);
        sb.append(", size=").append(size);
        sb.append(", input=").append(input);
        sb.append(", output=").append(output);
        sb.append(", color=").append(color);
        sb.append(", power=").append(power);
        sb.append(", circuitProtections=").append(circuitProtections);
        sb.append(", dimension=").append(dimension);
        sb.append(", service=").append(service);
        sb.append(", port=").append(port);
        sb.append(", pin=").append(pin);
        sb.append(", plug=").append(plug);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}