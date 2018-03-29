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

package io.securecodebox.scanprocess.nmap;

import io.securecodebox.model.Report;
import io.securecodebox.model.execution.ScanProcessExecution;
import io.securecodebox.model.execution.ScanProcessExecutionFactory;
import io.securecodebox.persistence.PersistenceProvider;
import io.securecodebox.persistence.PersistenceProviderFactory;
import io.securecodebox.scanprocess.PersistenceAwareTaskListener;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersistGenericFindingsListener extends PersistenceAwareTaskListener {

    private static final Logger LOG = LoggerFactory.getLogger(PersistGenericFindingsListener.class);

    @Autowired
    private ScanProcessExecutionFactory scanProcessExecutionFactory;

    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {
        LOG.info("PersistGenericFindingsListener called");

        ScanProcessExecution execution = scanProcessExecutionFactory.get(delegateExecution);

        PersistenceProvider persistenceProvider = PersistenceProviderFactory.get();

        Report report = new Report(execution);

        if (persistenceProvider != null) {
            persistenceProvider.persist(report);
        }
    }
}
