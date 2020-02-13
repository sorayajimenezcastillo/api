package com.speedtest.api.model;

public class SpeedTestData {
    private Speed speeds;
    private Client client;
    private Server server;

    public Speed getSpeeds() {
        return speeds;
    }

    public void setSpeeds(Speed speeds) {
        this.speeds = speeds;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }
}
