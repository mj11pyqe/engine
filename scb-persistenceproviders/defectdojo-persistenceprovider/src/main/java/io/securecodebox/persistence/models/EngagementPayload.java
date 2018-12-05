/*
 *
 *  SecureCodeBox (SCB)
 *  Copyright 2015-2018 iteratec GmbH
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  	http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * /
 */
package io.securecodebox.persistence.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.List;

public class EngagementPayload {
    @JsonProperty
    protected String name;

    @JsonProperty
    protected String product;

    @JsonProperty("target_start")
    protected String targetStart;

    @JsonProperty("target_end")
    protected String targetEnd;

    @JsonProperty
    protected String lead;

    @JsonProperty("engagement_type")
    protected String engagementType =  "CI/CD";

    @JsonProperty
    protected Status status = Status.IN_PROGRESS;

    @JsonProperty
    protected List<String> tags = Arrays.asList("secureCodeBox", "automated");

    /**
     * Currently only contains the statuses relevant to us.
     * If you need others, feel free to add them ;)
     */
    public static enum Status {
        @JsonProperty("Completed")
        COMPLETED,
        @JsonProperty("In Progress")
        IN_PROGRESS
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getTargetStart() {
        return targetStart;
    }

    public void setTargetStart(String targetStart) {
        this.targetStart = targetStart;
    }

    public String getTargetEnd() {
        return targetEnd;
    }

    public void setTargetEnd(String targetEnd) {
        this.targetEnd = targetEnd;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public String getEngagementType() {
        return engagementType;
    }

    public void setEngagementType(String engagementType) {
        this.engagementType = engagementType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
