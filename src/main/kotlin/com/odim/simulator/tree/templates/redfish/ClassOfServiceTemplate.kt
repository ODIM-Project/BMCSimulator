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
import com.odim.simulator.tree.RedfishVersion.V1_0_2
import com.odim.simulator.tree.RedfishVersion.V1_1_0
import com.odim.simulator.tree.RedfishVersion.V1_1_1
import com.odim.simulator.tree.RedfishVersion.V1_1_2
import com.odim.simulator.tree.RedfishVersion.V1_2_0
import com.odim.simulator.tree.ResourceTemplate
import com.odim.simulator.tree.Template
import com.odim.simulator.tree.structure.Actions
import com.odim.simulator.tree.structure.EmbeddedObjectType.RESOURCE_IDENTIFIER
import com.odim.simulator.tree.structure.LinkableResourceArray
import com.odim.simulator.tree.structure.Resource.Companion.embeddedObject
import com.odim.simulator.tree.structure.Resource.Companion.resourceObject
import com.odim.simulator.tree.structure.ResourceType.CLASS_OF_SERVICE
import com.odim.simulator.tree.structure.ResourceType.DATA_PROTECTION_LINE_OF_SERVICE
import com.odim.simulator.tree.structure.ResourceType.DATA_SECURITY_LINE_OF_SERVICE
import com.odim.simulator.tree.structure.ResourceType.DATA_STORAGE_LINE_OF_SERVICE
import com.odim.simulator.tree.structure.ResourceType.IO_CONNECTIVITY_LINE_OF_SERVICE
import com.odim.simulator.tree.structure.ResourceType.IO_PERFORMANCE_LINE_OF_SERVICE

/**
 * This is generated class. Please don't edit it's contents.
 */
@Template(CLASS_OF_SERVICE)
open class ClassOfServiceTemplate : ResourceTemplate() {
    init {
        version(V1_0_0, resourceObject(
                "Oem" to embeddedObject(),
                "Id" to 0,
                "Description" to "Class Of Service Description",
                "Name" to "Class Of Service",
                "Identifier" to embeddedObject(RESOURCE_IDENTIFIER),
                "ClassOfServiceVersion" to null
        ))
        version(V1_0_1, V1_0_0)
        version(V1_0_2, V1_0_1)
        version(V1_1_0, V1_0_0, resourceObject(
                "Actions" to Actions()
        ))
        version(V1_1_1, V1_0_0, resourceObject(
                "DataProtectionLinesOfService" to LinkableResourceArray(DATA_PROTECTION_LINE_OF_SERVICE),
                "DataSecurityLinesOfService" to LinkableResourceArray(DATA_SECURITY_LINE_OF_SERVICE),
                "DataStorageLinesOfService" to LinkableResourceArray(DATA_STORAGE_LINE_OF_SERVICE),
                "IOConnectivityLinesOfService" to LinkableResourceArray(IO_CONNECTIVITY_LINE_OF_SERVICE),
                "IOPerformanceLinesOfService" to LinkableResourceArray(IO_PERFORMANCE_LINE_OF_SERVICE)
        ))
        version(V1_1_2, V1_1_1)
        version(V1_2_0, V1_1_2)
    }
}
