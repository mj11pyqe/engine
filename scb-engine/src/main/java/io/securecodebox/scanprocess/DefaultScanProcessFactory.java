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

import io.securecodebox.sdk.ScanProcessExecution;
import io.securecodebox.sdk.ScanProcessExecutionFactory;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;

/**
 * @author Rüdiger Heins - iteratec GmbH
 * @since 01.03.18
 */
@Component
public class DefaultScanProcessFactory implements ScanProcessExecutionFactory {
    @Override
    public ScanProcessExecution build(DelegateExecution execution) {
        return new DefaultScanProcess(execution);
    }

    @Override
    public <P extends ScanProcessExecution> P build(DelegateExecution execution, Class<P> customProcess) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    @Override
    public <P extends ScanProcessExecution> ScanProcessExecution register(Class<P> customProcess) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }
}
