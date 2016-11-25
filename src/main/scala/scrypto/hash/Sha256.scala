package scrypto.hash

import java.security.MessageDigest

/**
  * Hashing functions implementation with sha256 impl from Java SDK
  */
object Sha256 extends CryptographicHash32 {
  override def hash(input: Array[Byte]) = MessageDigest.getInstance("SHA-256").digest(input)
}