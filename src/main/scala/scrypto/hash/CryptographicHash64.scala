package scrypto.hash

import scrypto.hash.CryptographicHash
import scrypto.utils.NatConstants.Nat64
import shapeless.Sized

trait CryptographicHash64 extends CryptographicHash {

  type SizedDigest = Sized[Array[Byte], Nat64]

  override val DigestSize: Int = 64

  def hashSized(in: Message): SizedDigest = Sized.wrap(hash(in))

  def hashSized(in: String): SizedDigest = hashSized(in.getBytes)
}
