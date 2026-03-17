package adt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import model.*;

public class ChargingManager {

    private ArrayList<ChargingHub> hubs;
    private Queue<Device> waitingQueue;
    private Stack<ChargingSession> sessions;

    public ChargingManager() {
        hubs = new ArrayList<>();
        waitingQueue = new LinkedList<>();
        sessions = new Stack<>();
    }

    // ------------------ HUB CRUD ------------------

    // Create
    public void addHub(ChargingHub hub) {
        hubs.add(hub);
    }

    // Read
    public ArrayList<ChargingHub> getHubs() {
        return hubs;
    }

    // Delete
    public void removeHub(String hubID) {
        hubs.removeIf(h -> h.getHubID().equals(hubID));
    }

    // ------------------ DEVICE QUEUE ------------------

    public void addDeviceToQueue(Device device) {
        waitingQueue.add(device);
    }

    public Device startCharging() {
        return waitingQueue.poll();
    }

    public Queue<Device> getQueue() {
        return waitingQueue;
    }

    // ------------------ SESSION STACK ------------------

    public void addSession(ChargingSession session) {
        sessions.push(session);
    }

    public ChargingSession getLastSession() {
        if (!sessions.isEmpty()) {
            return sessions.peek();
        }
        return null;
    }
}