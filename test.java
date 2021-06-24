export interface IIrohaTestLedgerConstructorOptions {
  containerImageVersion?: string;
  containerImageName?: string;
  rpcTorriPort?: number;
  envVars?: string[];
  logLevel?: LogLevelDesc;
}


watchBlockV1确认
普罗米修斯 加回来 然后DOUBLE CHECK
发邮件给GREG 


export interface IPluginLedgerConnectorIrohaOptions
  extends ICactusPluginOptions {
  rpcTorriPort: string;
  pluginRegistry: PluginRegistry;
  prometheusExporter?: PrometheusExporter;
  logLevel?: LogLevelDesc;
}