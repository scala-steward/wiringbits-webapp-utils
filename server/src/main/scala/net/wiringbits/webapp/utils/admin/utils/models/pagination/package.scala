package net.wiringbits.webapp.utils.admin.utils.models

import net.wiringbits.webapp.utils.api.common.models.core.WrappedInt

package object pagination {
  case class Count(int: Int) extends AnyVal with WrappedInt

  case class Offset(int: Int) extends AnyVal with WrappedInt

  case class Limit(int: Int) extends AnyVal with WrappedInt

  case class PaginatedQuery(offset: Offset, limit: Limit)

  case class PaginatedResult[+T](data: T, offset: Offset, limit: Limit, total: Count)
}
