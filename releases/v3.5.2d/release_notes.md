# **Custom branch release**

Based on upstream `v3.5.2`, with the following additions:

&nbsp;
# **Added**
1. `voucherFlashSalev2.bsh` (Tokopedia) — shipping-method variant targeting Kurir toko (Rp0), using hardcoded node ids `jf7`/`dd2`.
2. `ppPaymentFlashSale.bsh` (Tokopedia) — Tokopedia payment flash sale.
3. Shopee flash sale scripts: `cpFlashSale.bsh`, `pdpOOSFlashsale.bsh`, `pdpVoucherFlashSale.bsh`.
4. `waitNTP.bsh` — NTP sync and precise wait until a target time.
5. Dialog functions: `dateTimePickerDialog`, `choiceDialog`, `longInputDialog`, with `importCommands("dialog")` wired into `code/import.java`.
6. Release trigger for custom `v*.*.*-*` tags.

&nbsp;
# **Fixes**
1. `Undefined argument TOP` crash at `assist/NodeInfo.bsh` line 104 on devices whose framework does not expose the private `AccessibilityNodeInfo.mBooleanProperties` field, reported on Samsung. The reflection failure was already handled via `hasPropertyField`; the crash came from the log call in the `catch` block referencing an undeclared `TOP`.

&nbsp;
# **Changed**
1. `UpdateManager` owner set to `schrodienieur` so custom releases are served from this fork.
2. Synced with upstream through `v3.5.14-beta` (window filters, display capture on action dialogs, node search fixes).