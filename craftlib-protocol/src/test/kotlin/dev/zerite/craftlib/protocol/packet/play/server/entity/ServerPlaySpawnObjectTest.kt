package dev.zerite.craftlib.protocol.packet.play.server.entity

import dev.zerite.craftlib.protocol.ObjectData
import dev.zerite.craftlib.protocol.data.registry.impl.MagicObject
import dev.zerite.craftlib.protocol.packet.PacketTest
import dev.zerite.craftlib.protocol.version.ProtocolVersion

/**
 * Sent by the server when an object / vehicle is created.
 *
 * @author Koding
 * @since  0.1.0-SNAPSHOT
 */
class ServerPlaySpawnObjectTest : PacketTest<ServerPlaySpawnObjectPacket>(ServerPlaySpawnObjectPacket) {}