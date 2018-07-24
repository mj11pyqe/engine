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

package io.securecodebox.engine.helper;

import org.camunda.bpm.engine.FilterService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.spring.boot.starter.configuration.impl.AbstractCamundaConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * This configuration file generates the default task list filter
 *
 * @author Jannik Hollenbach - iteratec GmbH
 * @since 19.07.18
 */
@Configuration
@Profile({"dev"})
public class DefaultTasklistFilterConfiguration extends AbstractCamundaConfiguration {
    @Override
    public void postProcessEngineBuild(final ProcessEngine processEngine) {
        final FilterService filterService = processEngine.getFilterService();
        filterService.saveFilter(filterService.newTaskFilter("All Tasks"));
    }
}