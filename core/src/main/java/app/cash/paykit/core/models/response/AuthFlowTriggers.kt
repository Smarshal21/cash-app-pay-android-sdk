/*
 * Copyright (C) 2023 Cash App
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package app.cash.paykit.core.models.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuthFlowTriggers(
  @Json(name = "mobile_url")
  val mobileUrl: String,
  @Json(name = "qr_code_image_url")
  val qrCodeImageUrl: String,
  @Json(name = "qr_code_svg_url")
  val qrCodeSvgUrl: String,
  @Json(name = "refreshes_at")
  val refreshesAt: String,
)
