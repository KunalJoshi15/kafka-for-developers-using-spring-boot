package com.learnkafka.domain;
// if we want to distinguish among the type of event that is getting posted to the kafka topic.
// we can have an event type in it. Using which we can identify for what information the update is corresponding to.
public enum LibraryEventType {
    NEW,
    UPDATE
}
