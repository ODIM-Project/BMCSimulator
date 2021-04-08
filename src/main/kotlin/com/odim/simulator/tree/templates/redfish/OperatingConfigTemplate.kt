// Copyright (c) Intel Corporation
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.odim.simulator.tree.templates.redfish

import com.odim.simulator.tree.RedfishVersion.V1_0_0
import com.odim.simulator.tree.RedfishVersion.V1_0_1
import com.odim.simulator.tree.ResourceTemplate
import com.odim.simulator.tree.Template
import com.odim.simulator.tree.structure.Actions
import com.odim.simulator.tree.structure.EmbeddedObjectType.BASE_SPEED_PRIORITY_SETTINGS
import com.odim.simulator.tree.structure.EmbeddedObjectType.TURBO_PROFILE_DATAPOINT
import com.odim.simulator.tree.structure.Resource.Companion.embeddedArray
import com.odim.simulator.tree.structure.Resource.Companion.embeddedObject
import com.odim.simulator.tree.structure.Resource.Companion.resourceObject
import com.odim.simulator.tree.structure.ResourceType.OPERATING_CONFIG

/**
 * This is generated class. Please don't edit it's contents.
 */
@Template(OPERATING_CONFIG)
open class OperatingConfigTemplate : ResourceTemplate() {
    init {
        version(V1_0_0, resourceObject(
                "Oem" to embeddedObject(),
                "Id" to 0,
                "Description" to "Operating Config Description",
                "Name" to "Operating Config",
                "TotalAvailableCoreCount" to null,
                "TDPWatts" to null,
                "BaseSpeedMHz" to null,
                "MaxSpeedMHz" to null,
                "MaxJunctionTemperatureCelsius" to null,
                "BaseSpeedPrioritySettings" to embeddedArray(BASE_SPEED_PRIORITY_SETTINGS),
                "TurboProfile" to embeddedArray(TURBO_PROFILE_DATAPOINT),
                "Actions" to Actions()
        ))
        version(V1_0_1, V1_0_0)
    }
}
