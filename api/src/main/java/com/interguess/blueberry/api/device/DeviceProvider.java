package com.interguess.blueberry.api.device;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * DeviceProvider is an abstract class that provides a way to access registered devices in the Blueberry instance.
 * It allows for retrieving all devices, regardless of their online or offline status.
 * The singleton instance of DeviceProvider can be set and accessed through the static methods.
 */
public abstract class DeviceProvider {

    @Getter
    @Setter
    private static DeviceProvider instance;

    /**
     * Checks if the DeviceProvider is initialized.
     *
     * @return true if the DeviceProvider instance is initialized, false otherwise
     */
    public static boolean isInitialized() {
        return instance != null;
    }

    /**
     * Gets all devices that are registered in this blueberry instance.
     *
     * @return a list of all registered devices, no matter if they are online or offline.
     * If no devices are registered, an empty list is returned.
     */
    public abstract @NotNull List<Device> getDevices();
}
