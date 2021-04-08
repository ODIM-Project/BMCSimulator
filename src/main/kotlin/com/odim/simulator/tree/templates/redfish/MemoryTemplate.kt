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
import com.odim.simulator.tree.RedfishVersion.V1_0_10
import com.odim.simulator.tree.RedfishVersion.V1_0_2
import com.odim.simulator.tree.RedfishVersion.V1_0_3
import com.odim.simulator.tree.RedfishVersion.V1_0_4
import com.odim.simulator.tree.RedfishVersion.V1_0_5
import com.odim.simulator.tree.RedfishVersion.V1_0_6
import com.odim.simulator.tree.RedfishVersion.V1_0_7
import com.odim.simulator.tree.RedfishVersion.V1_0_8
import com.odim.simulator.tree.RedfishVersion.V1_0_9
import com.odim.simulator.tree.RedfishVersion.V1_10_0
import com.odim.simulator.tree.RedfishVersion.V1_1_0
import com.odim.simulator.tree.RedfishVersion.V1_1_1
import com.odim.simulator.tree.RedfishVersion.V1_1_2
import com.odim.simulator.tree.RedfishVersion.V1_1_3
import com.odim.simulator.tree.RedfishVersion.V1_1_4
import com.odim.simulator.tree.RedfishVersion.V1_1_5
import com.odim.simulator.tree.RedfishVersion.V1_1_6
import com.odim.simulator.tree.RedfishVersion.V1_1_7
import com.odim.simulator.tree.RedfishVersion.V1_1_8
import com.odim.simulator.tree.RedfishVersion.V1_1_9
import com.odim.simulator.tree.RedfishVersion.V1_2_0
import com.odim.simulator.tree.RedfishVersion.V1_2_1
import com.odim.simulator.tree.RedfishVersion.V1_2_2
import com.odim.simulator.tree.RedfishVersion.V1_2_3
import com.odim.simulator.tree.RedfishVersion.V1_2_4
import com.odim.simulator.tree.RedfishVersion.V1_2_5
import com.odim.simulator.tree.RedfishVersion.V1_2_6
import com.odim.simulator.tree.RedfishVersion.V1_2_7
import com.odim.simulator.tree.RedfishVersion.V1_2_8
import com.odim.simulator.tree.RedfishVersion.V1_3_0
import com.odim.simulator.tree.RedfishVersion.V1_3_1
import com.odim.simulator.tree.RedfishVersion.V1_3_2
import com.odim.simulator.tree.RedfishVersion.V1_3_3
import com.odim.simulator.tree.RedfishVersion.V1_3_4
import com.odim.simulator.tree.RedfishVersion.V1_3_5
import com.odim.simulator.tree.RedfishVersion.V1_3_6
import com.odim.simulator.tree.RedfishVersion.V1_3_7
import com.odim.simulator.tree.RedfishVersion.V1_3_8
import com.odim.simulator.tree.RedfishVersion.V1_4_0
import com.odim.simulator.tree.RedfishVersion.V1_4_1
import com.odim.simulator.tree.RedfishVersion.V1_4_2
import com.odim.simulator.tree.RedfishVersion.V1_4_3
import com.odim.simulator.tree.RedfishVersion.V1_4_4
import com.odim.simulator.tree.RedfishVersion.V1_4_5
import com.odim.simulator.tree.RedfishVersion.V1_4_6
import com.odim.simulator.tree.RedfishVersion.V1_4_7
import com.odim.simulator.tree.RedfishVersion.V1_4_8
import com.odim.simulator.tree.RedfishVersion.V1_5_0
import com.odim.simulator.tree.RedfishVersion.V1_5_1
import com.odim.simulator.tree.RedfishVersion.V1_5_2
import com.odim.simulator.tree.RedfishVersion.V1_5_3
import com.odim.simulator.tree.RedfishVersion.V1_5_4
import com.odim.simulator.tree.RedfishVersion.V1_5_5
import com.odim.simulator.tree.RedfishVersion.V1_5_6
import com.odim.simulator.tree.RedfishVersion.V1_5_7
import com.odim.simulator.tree.RedfishVersion.V1_6_0
import com.odim.simulator.tree.RedfishVersion.V1_6_1
import com.odim.simulator.tree.RedfishVersion.V1_6_2
import com.odim.simulator.tree.RedfishVersion.V1_6_3
import com.odim.simulator.tree.RedfishVersion.V1_6_4
import com.odim.simulator.tree.RedfishVersion.V1_6_5
import com.odim.simulator.tree.RedfishVersion.V1_6_6
import com.odim.simulator.tree.RedfishVersion.V1_7_0
import com.odim.simulator.tree.RedfishVersion.V1_7_1
import com.odim.simulator.tree.RedfishVersion.V1_7_2
import com.odim.simulator.tree.RedfishVersion.V1_7_3
import com.odim.simulator.tree.RedfishVersion.V1_7_4
import com.odim.simulator.tree.RedfishVersion.V1_7_5
import com.odim.simulator.tree.RedfishVersion.V1_8_0
import com.odim.simulator.tree.RedfishVersion.V1_8_1
import com.odim.simulator.tree.RedfishVersion.V1_8_2
import com.odim.simulator.tree.RedfishVersion.V1_8_3
import com.odim.simulator.tree.RedfishVersion.V1_9_0
import com.odim.simulator.tree.RedfishVersion.V1_9_1
import com.odim.simulator.tree.RedfishVersion.V1_9_2
import com.odim.simulator.tree.RedfishVersion.V1_9_3
import com.odim.simulator.tree.ResourceTemplate
import com.odim.simulator.tree.Template
import com.odim.simulator.tree.structure.Action
import com.odim.simulator.tree.structure.ActionType.DISABLE_PASSPHRASE
import com.odim.simulator.tree.structure.ActionType.OVERWRITE_UNIT
import com.odim.simulator.tree.structure.ActionType.RESET
import com.odim.simulator.tree.structure.ActionType.SECURE_ERASE_UNIT
import com.odim.simulator.tree.structure.ActionType.SET_PASSPHRASE
import com.odim.simulator.tree.structure.ActionType.UNLOCK_UNIT
import com.odim.simulator.tree.structure.Actions
import com.odim.simulator.tree.structure.EmbeddedObjectType.MEMORY_LOCATION
import com.odim.simulator.tree.structure.EmbeddedObjectType.POWER_MANAGEMENT_POLICY
import com.odim.simulator.tree.structure.EmbeddedObjectType.REGION_SET
import com.odim.simulator.tree.structure.EmbeddedObjectType.RESOURCE_LOCATION
import com.odim.simulator.tree.structure.EmbeddedObjectType.SECURITY_CAPABILITIES
import com.odim.simulator.tree.structure.EmbeddedObjectType.STATUS
import com.odim.simulator.tree.structure.LinkableResource
import com.odim.simulator.tree.structure.Resource.Companion.embeddedArray
import com.odim.simulator.tree.structure.Resource.Companion.embeddedObject
import com.odim.simulator.tree.structure.Resource.Companion.resourceObject
import com.odim.simulator.tree.structure.ResourceType.ASSEMBLY
import com.odim.simulator.tree.structure.ResourceType.CHASSIS
import com.odim.simulator.tree.structure.ResourceType.MEMORY
import com.odim.simulator.tree.structure.ResourceType.MEMORY_METRICS
import com.odim.simulator.tree.structure.SingletonResource

/**
 * This is generated class. Please don't edit it's contents.
 */
@Template(MEMORY)
open class MemoryTemplate : ResourceTemplate() {
    init {
        version(V1_0_0, resourceObject(
                "Oem" to embeddedObject(),
                "Id" to 0,
                "Description" to "Memory Description",
                "Name" to "Memory",
                "MemoryType" to null,
                "MemoryDeviceType" to null,
                "BaseModuleType" to null,
                "MemoryMedia" to embeddedArray(),
                "CapacityMiB" to null,
                "DataWidthBits" to null,
                "BusWidthBits" to null,
                "Manufacturer" to null,
                "SerialNumber" to null,
                "PartNumber" to null,
                "AllowedSpeedsMHz" to embeddedArray(),
                "FirmwareRevision" to null,
                "FirmwareApiVersion" to null,
                "FunctionClasses" to embeddedArray(),
                "VendorID" to null,
                "DeviceID" to null,
                "SubsystemVendorID" to null,
                "SubsystemDeviceID" to null,
                "MaxTDPMilliWatts" to embeddedArray(),
                "SecurityCapabilities" to embeddedObject(SECURITY_CAPABILITIES),
                "SpareDeviceCount" to null,
                "RankCount" to null,
                "DeviceLocator" to null,
                "MemoryLocation" to embeddedObject(MEMORY_LOCATION),
                "ErrorCorrection" to null,
                "OperatingSpeedMhz" to null,
                "VolatileRegionSizeLimitMiB" to null,
                "PersistentRegionSizeLimitMiB" to null,
                "Regions" to embeddedArray(REGION_SET),
                "OperatingMemoryModes" to embeddedArray(),
                "PowerManagementPolicy" to embeddedObject(POWER_MANAGEMENT_POLICY),
                "IsSpareDeviceEnabled" to false,
                "IsRankSpareEnabled" to false,
                "Metrics" to SingletonResource(MEMORY_METRICS),
                "Actions" to Actions(
                        Action(UNLOCK_UNIT),
                        Action(SECURE_ERASE_UNIT),
                        Action(SET_PASSPHRASE),
                        Action(DISABLE_PASSPHRASE)
                )
        ))
        version(V1_0_1, V1_0_0)
        version(V1_0_2, V1_0_1)
        version(V1_0_3, V1_0_2)
        version(V1_0_4, V1_0_3)
        version(V1_0_5, V1_0_4)
        version(V1_0_6, V1_0_5)
        version(V1_0_7, V1_0_6)
        version(V1_0_8, V1_0_7)
        version(V1_0_9, V1_0_8)
        version(V1_0_10, V1_0_9)
        version(V1_1_0, V1_0_1, resourceObject(
                "Status" to embeddedObject(STATUS)
        ))
        version(V1_1_1, V1_1_0)
        version(V1_1_2, V1_1_1)
        version(V1_1_3, V1_1_2)
        version(V1_1_4, V1_1_3)
        version(V1_1_5, V1_1_4)
        version(V1_1_6, V1_1_5)
        version(V1_1_7, V1_1_6)
        version(V1_1_8, V1_1_7)
        version(V1_1_9, V1_1_8)
        version(V1_2_0, V1_1_1, resourceObject(
                "VolatileRegionNumberLimit" to null,
                "PersistentRegionNumberLimit" to null,
                "VolatileRegionSizeMaxMiB" to null,
                "PersistentRegionSizeMaxMiB" to null,
                "AllocationIncrementMiB" to null,
                "AllocationAlignmentMiB" to null,
                "Links" to embeddedObject(
                        "Oem" to embeddedObject(),
                        "Chassis" to LinkableResource(CHASSIS)
                )
        ))
        version(V1_2_1, V1_2_0)
        version(V1_2_2, V1_2_1)
        version(V1_2_3, V1_2_2)
        version(V1_2_4, V1_2_3)
        version(V1_2_5, V1_2_4)
        version(V1_2_6, V1_2_5)
        version(V1_2_7, V1_2_6)
        version(V1_2_8, V1_2_7)
        version(V1_3_0, V1_2_0, resourceObject(
                "ModuleManufacturerID" to null,
                "ModuleProductID" to null,
                "MemorySubsystemControllerManufacturerID" to null,
                "MemorySubsystemControllerProductID" to null
        ))
        version(V1_3_1, V1_3_0)
        version(V1_3_2, V1_3_1)
        version(V1_3_3, V1_3_2)
        version(V1_3_4, V1_3_3)
        version(V1_3_5, V1_3_4)
        version(V1_3_6, V1_3_5)
        version(V1_3_7, V1_3_6)
        version(V1_3_8, V1_3_7)
        version(V1_4_0, V1_3_1, resourceObject(
                "VolatileSizeMiB" to null,
                "NonVolatileSizeMiB" to null,
                "CacheSizeMiB" to null,
                "LogicalSizeMiB" to null,
                "Location" to embeddedObject(RESOURCE_LOCATION),
                "Assembly" to SingletonResource(ASSEMBLY)
        ))
        version(V1_4_1, V1_4_0)
        version(V1_4_2, V1_4_1)
        version(V1_4_3, V1_4_2)
        version(V1_4_4, V1_4_3)
        version(V1_4_5, V1_4_4)
        version(V1_4_6, V1_4_5)
        version(V1_4_7, V1_4_6)
        version(V1_4_8, V1_4_7)
        version(V1_5_0, V1_4_1)
        version(V1_5_1, V1_5_0)
        version(V1_5_2, V1_5_1)
        version(V1_5_3, V1_5_2)
        version(V1_5_4, V1_5_3)
        version(V1_5_5, V1_5_4)
        version(V1_5_6, V1_5_5)
        version(V1_5_7, V1_5_6)
        version(V1_6_0, V1_5_1, embeddedObject(
                "Actions" to Actions(
                        Action(OVERWRITE_UNIT)
                )
        ))
        version(V1_6_1, V1_6_0)
        version(V1_6_2, V1_6_1)
        version(V1_6_3, V1_6_2)
        version(V1_6_4, V1_6_3)
        version(V1_6_5, V1_6_4)
        version(V1_6_6, V1_6_5)
        version(V1_7_0, V1_6_1, resourceObject(
                "SecurityState" to null,
                "ConfigurationLocked" to null
        ))
        version(V1_7_1, V1_7_0)
        version(V1_7_2, V1_7_1)
        version(V1_7_3, V1_7_2)
        version(V1_7_4, V1_7_3)
        version(V1_7_5, V1_7_4)
        version(V1_8_0, V1_7_2, embeddedObject(
                "Actions" to Actions(
                        Action(RESET, "ResetType", mutableListOf(
                                "On",
                                "ForceOff",
                                "GracefulShutdown",
                                "GracefulRestart",
                                "ForceRestart",
                                "Nmi",
                                "ForceOn",
                                "PushPowerButton",
                                "PowerCycle"
                        ))
                )
        ))
        version(V1_8_1, V1_8_0)
        version(V1_8_2, V1_8_1)
        version(V1_8_3, V1_8_2)
        version(V1_9_0, V1_8_0)
        version(V1_9_1, V1_9_0)
        version(V1_9_2, V1_9_1)
        version(V1_9_3, V1_9_2)
        version(V1_10_0, V1_9_3, resourceObject(
                "LocationIndicatorActive" to null
        ))
    }
}
