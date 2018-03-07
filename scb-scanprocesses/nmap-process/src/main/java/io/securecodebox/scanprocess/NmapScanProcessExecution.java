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

package io.securecodebox.scanprocess;

import org.camunda.bpm.engine.delegate.DelegateExecution;

/**
 * @author Rüdiger Heins - iteratec GmbH
 * @since 01.03.18
 */
public class NmapScanProcessExecution extends DefaultScanProcessExcecution {
    public static final String NMAP_PARAMETER = "nmap_parameter";
    public static final String NMAP_TARGET = "nmap_target";

    /**
     * @param execution
     */
    NmapScanProcessExecution(DelegateExecution execution) {
        super(execution);
    }

    public String getNmapParameter() {
        return getStringOrEmpty(this.execution.getVariableTyped(NMAP_PARAMETER));
    }

    public String getPortScannerTarget() {
        return getStringOrEmpty(this.execution.getVariableTyped(NMAP_TARGET));
    }

    public void setNmapParameter(String nmapParameter) {
        this.execution.setVariable(NMAP_PARAMETER, nmapParameter);
    }

    public void setPortScannerTarget(String portScannerTarget) {
        this.execution.setVariable(NMAP_TARGET, portScannerTarget);
    }
}