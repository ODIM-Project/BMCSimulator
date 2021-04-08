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
import com.odim.simulator.tree.RedfishVersion.V1_0_2
import com.odim.simulator.tree.RedfishVersion.V1_0_3
import com.odim.simulator.tree.RedfishVersion.V1_0_4
import com.odim.simulator.tree.RedfishVersion.V1_0_5
import com.odim.simulator.tree.RedfishVersion.V1_0_6
import com.odim.simulator.tree.RedfishVersion.V1_0_7
import com.odim.simulator.tree.RedfishVersion.V1_0_8
import com.odim.simulator.tree.RedfishVersion.V1_1_0
import com.odim.simulator.tree.RedfishVersion.V1_1_1
import com.odim.simulator.tree.RedfishVersion.V1_1_2
import com.odim.simulator.tree.RedfishVersion.V1_1_3
import com.odim.simulator.tree.RedfishVersion.V1_1_4
import com.odim.simulator.tree.RedfishVersion.V1_1_5
import com.odim.simulator.tree.RedfishVersion.V1_2_0
import com.odim.simulator.tree.RedfishVersion.V1_2_1
import com.odim.simulator.tree.RedfishVersion.V1_2_2
import com.odim.simulator.tree.RedfishVersion.V1_2_3
import com.odim.simulator.tree.RedfishVersion.V1_2_4
import com.odim.simulator.tree.RedfishVersion.V1_3_0
import com.odim.simulator.tree.RedfishVersion.V1_3_1
import com.odim.simulator.tree.RedfishVersion.V1_3_2
import com.odim.simulator.tree.RedfishVersion.V1_3_3
import com.odim.simulator.tree.RedfishVersion.V1_4_0
import com.odim.simulator.tree.RedfishVersion.V1_4_1
import com.odim.simulator.tree.RedfishVersion.V1_4_2
import com.odim.simulator.tree.RedfishVersion.V1_4_3
import com.odim.simulator.tree.RedfishVersion.V1_5_0
import com.odim.simulator.tree.RedfishVersion.V1_5_1
import com.odim.simulator.tree.RedfishVersion.V1_5_2
import com.odim.simulator.tree.RedfishVersion.V1_6_0
import com.odim.simulator.tree.RedfishVersion.V1_6_1
import com.odim.simulator.tree.ResourceTemplate
import com.odim.simulator.tree.Template
import com.odim.simulator.tree.structure.Actions
import com.odim.simulator.tree.structure.EmbeddedObjectType.HTTPS_PROTOCOL
import com.odim.simulator.tree.structure.EmbeddedObjectType.NTP_PROTOCOL
import com.odim.simulator.tree.structure.EmbeddedObjectType.PROTOCOL
import com.odim.simulator.tree.structure.EmbeddedObjectType.SNMP_PROTOCOL
import com.odim.simulator.tree.structure.EmbeddedObjectType.SSD_PROTOCOL
import com.odim.simulator.tree.structure.EmbeddedObjectType.STATUS
import com.odim.simulator.tree.structure.Resource.Companion.embeddedObject
import com.odim.simulator.tree.structure.Resource.Companion.resourceObject
import com.odim.simulator.tree.structure.ResourceType.MANAGER_NETWORK_PROTOCOL

/**
 * This is generated class. Please don't edit it's contents.
 */
@Template(MANAGER_NETWORK_PROTOCOL)
open class ManagerNetworkProtocolTemplate : ResourceTemplate() {
    init {
        version(V1_0_0, resourceObject(
                "Oem" to embeddedObject(),
                "Id" to "ManagerNetworkProtocol",
                "Description" to "Manager Network Protocol Description",
                "Name" to "Manager Network Protocol",
                "HostName" to null,
                "FQDN" to null,
                "HTTP" to embeddedObject(PROTOCOL),
                "HTTPS" to embeddedObject(HTTPS_PROTOCOL),
                "SNMP" to embeddedObject(SNMP_PROTOCOL),
                "VirtualMedia" to embeddedObject(PROTOCOL),
                "Telnet" to embeddedObject(PROTOCOL),
                "SSDP" to embeddedObject(SSD_PROTOCOL),
                "IPMI" to embeddedObject(PROTOCOL),
                "SSH" to embeddedObject(PROTOCOL),
                "KVMIP" to embeddedObject(PROTOCOL),
                "Status" to embeddedObject(STATUS)
        ))
        version(V1_0_2, V1_0_0)
        version(V1_0_3, V1_0_2)
        version(V1_0_4, V1_0_3)
        version(V1_0_5, V1_0_4)
        version(V1_0_6, V1_0_5)
        version(V1_0_7, V1_0_6)
        version(V1_0_8, V1_0_7)
        version(V1_1_0, V1_0_3, resourceObject(
                "DHCP" to embeddedObject(PROTOCOL)
        ))
        version(V1_1_1, V1_1_0)
        version(V1_1_2, V1_1_1)
        version(V1_1_3, V1_1_2)
        version(V1_1_4, V1_1_3)
        version(V1_1_5, V1_1_4)
        version(V1_2_0, V1_1_1, resourceObject(
                "NTP" to embeddedObject(NTP_PROTOCOL),
                "Actions" to Actions()
        ))
        version(V1_2_1, V1_2_0)
        version(V1_2_2, V1_2_1)
        version(V1_2_3, V1_2_2)
        version(V1_2_4, V1_2_3)
        version(V1_3_0, V1_2_1, resourceObject(
                "DHCPv6" to embeddedObject(PROTOCOL),
                "RDP" to embeddedObject(PROTOCOL),
                "RFB" to embeddedObject(PROTOCOL)
        ))
        version(V1_3_1, V1_3_0)
        version(V1_3_2, V1_3_1)
        version(V1_3_3, V1_3_2)
        version(V1_4_0, V1_3_0)
        version(V1_4_1, V1_4_0)
        version(V1_4_2, V1_4_1)
        version(V1_4_3, V1_4_2)
        version(V1_5_0, V1_4_2)
        version(V1_5_1, V1_5_0)
        version(V1_5_2, V1_5_1)
        version(V1_6_0, V1_5_1)
        version(V1_6_1, V1_6_0)
    }
}
