package edu.fgu.dclab;

public abstract class AbstractMessage implements Message {
    protected String source = "站長";

    public String getSource() {
        return this.source;
    }
}
