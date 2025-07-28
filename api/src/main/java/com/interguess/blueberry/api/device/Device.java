package com.interguess.blueberry.api.device;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a blueberry speaker device.
 * This interface defines the basic properties and behaviors
 * of a device in the Blueberry ecosystem.
 */
public interface Device {

    /**
     * Gets the unique identifier of the device.
     *
     * @return the unique identifier
     */
    @NotNull String getSerialNumber();

    /**
     * Gets the model of the device.
     *
     * @return the model of the device
     */
    @NotNull String getModel();

    /**
     * Gets the manufacturer of the device.
     *
     * @return the manufacturer of the device
     */
    @NotNull String getManufacturer();

    /**
     * Gets the operating system of the device.
     *
     * @return the operating system of the device
     */
    @NotNull String getOperatingSystem();

    /**
     * Gets the version of the operating system running on the device.
     *
     * @return the version of the operating system
     */
    @NotNull String getOperatingSystemVersion();

    /**
     * Gets the name of the device.
     *
     * @return the name of the device
     */
    @NotNull String getDeviceName();

    /**
     * Gets the status of the device.
     *
     * @return the status of the device
     */
    @NotNull DeviceStatus getStatus();
}
