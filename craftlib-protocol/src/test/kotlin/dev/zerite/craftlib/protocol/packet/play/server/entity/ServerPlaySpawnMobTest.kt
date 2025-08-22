package dev.zerite.craftlib.protocol.packet.play.server.entity

import dev.zerite.craftlib.protocol.data.entity.EntityMetadata
import dev.zerite.craftlib.protocol.data.entity.MetadataValue
import dev.zerite.craftlib.protocol.data.registry.impl.MagicMobType
import dev.zerite.craftlib.protocol.packet.PacketTest
import dev.zerite.craftlib.protocol.version.ProtocolVersion

/**
 * Tests that the mob spawning packet is working properly, including testing
 * the data types of fixed point, step rotation and velocity.
 *
 * @author Koding
 * @since  0.1.0-SNAPSHOT
 */
class ServerPlaySpawnMobTest : PacketTest<ServerPlaySpawnMobPacket>(ServerPlaySpawnMobPacket) {
}
