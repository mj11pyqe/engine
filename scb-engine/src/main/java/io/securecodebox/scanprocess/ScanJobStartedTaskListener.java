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

/**
 * @author Robert Seedorff - iteratec GmbH
 *
 */
//@Component
//class ScanJobStartedTaskListener extends PersistenceAwareTaskListener {
//
//    private static final Logger LOG = LoggerFactory.getLogger(ScanJobStartedTaskListener.class);
//
//    /* (non-Javadoc)
//     * @see org.camunda.bpm.engine.delegate.ExecutionListener#notify(org.camunda.bpm.engine.delegate.DelegateExecution)
//     */
//    @Override
//    public void notify(DelegateExecution execution) throws Exception {
//
//        LOG.debug("ScanJobStartedTaskListener running...");
//
//        SecureBoxProcess process = new SecureBoxProcessExecution(execution);
//
//        // persist the extended results to the persistence store
//        this.storeResult(process.getUuid(), process.toMap(), this.config.job.indexType, process.getTenantId(), "")
//    }
//}
